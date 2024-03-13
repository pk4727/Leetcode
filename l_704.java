package Leetcode;

public class l_704 {
    public int search(int[] nums, int target) {
        return searchh(nums, target, 0, nums.length);
    }

    public static int searchh(int[] nums, int target, int start, int end) {
        if (start >= end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (nums[mid] == target) {
            return mid;
        }
        if (nums[mid] > target) {
            return searchh(nums, target, start, mid);
        }
        return searchh(nums, target, mid + 1, end);
    }
}