package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class l_349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> ans = new ArrayList<>();
        for (int k : nums1) {
            int prev = 0;
            for (int j = 0; j < nums2.length && prev <= k; j++) {
                if (k == nums2[j]) {
                    if (!ans.isEmpty() && ans.getLast() != nums2[j]) {
                        ans.add(nums2[j]);
                    } else if (ans.isEmpty()) {
                        ans.add(nums2[j]);
                    }
                }
                prev = k;
            }
        }
        int[] result = new int[ans.size()];
        int index = 0;
        for (int ele : ans) {
            result[index++] = ele;
        }
        return result;
    }
}
