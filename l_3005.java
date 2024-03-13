package Leetcode;

import java.util.HashMap;

public class l_3005 {
    public static void main(String[] args) {
        maxFrequencyElements(new int[] { 1, 2, 2, 3, 1, 4 });
        maxFrequencyElements(new int[] { 1, 2, 3, 4, 5 });
    }

    public static void maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> fre = new HashMap<>();
        int mf = 0;
        for (int i : nums) {
            fre.put(i, fre.getOrDefault(i, 0) + 1);
            mf = Math.max(fre.get(i), mf);
        }
        int sum = 0;
        for (int v : fre.values()) {
            if (mf == v) sum += v;
        }
        System.out.println(sum);
    }
}
