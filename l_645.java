package leetcode;

import java.util.Arrays;

public class l_645 {
    public static void main(String[] args) {
        // int[] arr = { 1, 2, 2, 4 };
        // int[] arr = { 1, 1 };
        int[] arr = { 3, 2, 2 };
        // int[] arr = { 2, 2 };
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }

    static int[] findErrorNums(int[] nums) {
        Cyclic_sort(nums);
        int[] ans = { 0, 0 };
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                ans[0] = nums[i];
                ans[1] = i + 1;
            }
        }
        return ans;
    }

    static int[] Cyclic_sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        }
        return arr;
    }
}
