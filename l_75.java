package leetcode;

import java.util.Arrays;

public class l_75 {
    public void sortColors2(int[] nums) {
        int countZero = 0, countOne = 0, countTwo = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                countZero++;
            }
            if (nums[i] == 1) {
                countOne++;
            } else {
                countTwo++;
            }
        }
        for (int i = 0; i < countZero; i++) {
            nums[i] = 0;
        }
        for (int i = countZero; i < countZero + countOne; i++) {
            nums[i] = 1;
        }
        for (int i = countZero + countOne; i < nums.length; i++) {
            nums[i] = 2;
        }
    }

    public static void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;
        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                swap(nums, mid, high);
                high--;
            }
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 0, 0, 1, 1, 2 };
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }
}
