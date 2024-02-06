package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class l_448 {
    public static void main(String[] args) {
        int[] nums = { 4,3,2,7,8,2,3,1 };
        System.out.println(disappeared(nums));
    }

    static List<Integer> disappeared(int[] nums) {
        Cyclic_sort(nums);
        System.out.println(Arrays.toString(nums));
        List<Integer> l = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != (i + 1)) {
                l.add(i + 1);
            }
        }
        return l;
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
