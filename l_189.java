package leetcode;

import java.util.Arrays;

public class l_189 {
    public static void main(String[] args) {
        // int[] arr = {-1};
        // int[] arr = {-1,-100,3,99};
        // int k = 2;
        // int[] arr = {1,2,3,4,5,6,7};
        int[] arr = { 1, 2 };
        int k = 3;
        rotate(arr, k);
        System.out.println(Arrays.toString(arr));
    }

    public static void rotate(int[] arr, int k) {
        int len = arr.length;
        k = k % len;
        if (len > 1) {
            int[] s = Arrays.copyOfRange(arr, 0, len - k);
            int[] e = Arrays.copyOfRange(arr, len - k, len);
            for (int i = 0; i < e.length; i++) {
                arr[i] = e[i];
            }
            for (int i = 0; i < s.length; i++) {
                arr[i + k] = s[i];
            }
        }
    }
}
