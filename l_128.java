package Leetcode;

import java.util.Arrays;

public class l_128 {

    public int longestConsecutive(int[] a) {
        if (a.length == 0) {
            return 0;
        }
        Arrays.sort(a);
        int count = 0;
        int cc = 1;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i + 1] - a[i] == 1 || a[i + 1] - a[i] == 0) {
                if (a[i + 1] - a[i] != 0) {
                    cc++;
                }
            } else {
                if (cc > count)
                    count = cc;
                cc = 1;
            }
        }
        return Math.max(cc, count);
    }
}