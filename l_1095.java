package leetcode;

public class l_1095 {
    public static void main(String[] args) {
        // int[] arr = { 1, 2, 3, 4, 5, 3, 1 };
        int[] arr= {0,1,2,4,2,1};
        int target = 3;
        System.out.println(search(arr, target));
    }

    static int search(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);
        int firstTry = order_agnostic_Binary_search(arr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        return order_agnostic_Binary_search(arr, target, peak + 1, arr.length - 1);
    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    static int order_agnostic_Binary_search(int[] arr, int target, int start, int end) {
        boolean is_asc = arr[start] < arr[end];
        while (start <= end) {
            int mid = (start + ((end - start) / 2));
            if (target == arr[mid]) {
                return mid;
            }
            if (is_asc) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else if (target < arr[mid]) {
                    end = mid - 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
