package leetcode;

public class l_852 {
    public static void main(String[] args) {
        // int[] arr = { 0, 1, 0 };
        // int[] arr = {0,2,3,0};
        int[] arr = { 0, 1, 5, 10, 2 };
        System.out.println(peakIndexInMountainArray(arr));
        System.out.println(peakIndexInMountainArray1(arr));
    }

    // arr[0] < arr[1] < ... < arr[i - 1] < arr[i] && arr[i] > arr[i + 1] > ... >
    // arr[arr.length - 1]
    static int peakIndexInMountainArray(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length - 2; i++) {
            max = arr[i + 1];
            if (arr[i] <= max && max >= arr[i + 2]) {
                return i + 1;
            }
        }
        return 0;
    }

    static int peakIndexInMountainArray1(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return 0;
        }
        int start = 0;
        int end = n - 1;
        while (start < end) {
            int mid = start + ((end - start) / 2);
            if (nums[mid] > nums[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}