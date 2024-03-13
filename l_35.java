package Leetcode;

public class l_35 {
    public int searchInsert(int[] arr, int x) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        int ans = n;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < x) {
                start = ++mid;
            } else {
                ans = mid;
                end = --mid;
            }
        }
        return ans;
    }
}
