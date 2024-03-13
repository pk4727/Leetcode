package Leetcode;

import java.util.Arrays;

public class l_2540 {
    public int getCommon(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        for (int i = 0; i < nums1.length; i++) {
            int prev = 0;
            for (int j = 0; j < nums2.length && prev < nums1[i]; j++) {
                if (nums1[i] == nums2[j]) {
                    return nums2[j];
                }
                prev = nums2[j];
            }
        }
        return -1;
    }
}