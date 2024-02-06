package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class l_34 {
    public static void main(String[] args) {
        int[] arr = { 5, 7, 7, 8, 8, 8, 10 };
        int target = 8;
        System.out.println(Arrays.toString(searchRange_LogN(arr, target)));
        System.out.println(Arrays.toString(searchRange_N(arr, target)));
    }

    static int[] searchRange_LogN(int[] nums, int target) {
        int[] ans = {-1, -1};
        ans[0] = search(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }
        return ans;
    }

    static int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (start + (end - start) / 2);
            if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }

    static int[] searchRange_N(int[] nums, int target) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                ans.add(i);
            }
        }
        if (ans.size() == 0) // if length 0f array is 0 or if target is not in array
        {
            return new int[] { -1, -1 };
        } else {
            return new int[] { ans.get(0), ans.get(ans.size() - 1) };
        }
    }
}