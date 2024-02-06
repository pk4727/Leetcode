package leetcode;

public class l_162 {
    public static void main(String[] args) {
        // int[] arr = { 1, 2 }; // 1
        int[] arr = {1,2,1,3,5,6,4}; // 5
        System.out.println(peakIndexInMountainArray(arr));
    }

    static int peakIndexInMountainArray(int[] nums) {
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