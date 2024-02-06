package leetcode;

import java.util.ArrayList;
import java.util.List;

public class l_442 {
    public static void main(String[] args) {
        int[] arr = { 4,3,2,7,8,2,3,1 };
        System.out.println(findDuplicates(arr));
    }

    static List<Integer> findDuplicates(int[] nums) {
        Cyclic_sort(nums);
        List<Integer> ans = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != (i + 1)) {
                ans.add(0,nums[i]);
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
