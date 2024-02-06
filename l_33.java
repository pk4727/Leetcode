package leetcode;

public class l_33 {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        // int target = 3;
        System.out.println(search(arr, target));
        System.out.println(countRotations(arr));
    }

    private static int countRotations(int[] arr) {
        int pivot = pivot_index(arr);
        return pivot + 1;
    }

    static int search(int[] nums, int target) {
        int pivot = pivot_index(nums);
        if (pivot == -1) // if you did not find a pivot, it means the array is not rotated
        {
            return Binary_search(nums, target, 0, nums.length - 1);
        }
        // if pivot is found
        if (nums[pivot] == target) {
            return pivot;
        }
        if (target >= nums[0]) {
            return Binary_search(nums, target, 0, pivot - 1);
        }
        return Binary_search(nums, target, pivot + 1, nums.length - 1);
    }

    static int Binary_search(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid; // ans found
            }
        }
        return -1;
    }

    // this will not work in duplicate values
    static int pivot_index(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) // in increasing order before end
            {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) // in increasing order before start
            {
                return mid - 1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // if elements at middle, start, end are equal then just skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // skip the duplicates
                // NOTE: what if these elements at start and end were the pivot??
                // check if start is pivot
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                // check whether end is pivot
                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            // left side is sorted, so pivot should be in right
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}