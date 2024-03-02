package leetcode;
import java.util.Arrays;

public class l_1901 {
    public static int[] findPeakGrid(int[][] arr) {
        return findPeakGrid(arr, 0, arr.length - 1);
    }

    private static int[] findPeakGrid(int[][] arr, int start, int end) {
        int mid = (start + end) / 2;
        int[] ans = { -1, -1 };

        while (start <= end) {
            int max = arr[mid][0];
            ans[0] = mid;
            ans[1] = 0;
            for (int i = 0; i < arr[mid].length; i++) {
                if (arr[mid][i] > max) {
                    max = arr[mid][i];
                    ans[0] = mid;
                    ans[1] = i;
                }
            }
            if (ans[0] + 1 <= arr.length - 1) {
                if (arr[ans[0]][ans[1]] < arr[ans[0] + 1][ans[1]]) {
                    return findPeakGrid(arr, mid + 1, end);
                }
            }
            if (ans[0] - 1 >= 0) {
                if (arr[ans[0]][ans[1]] < arr[ans[0] - 1][ans[1]]) {
                    return findPeakGrid(arr, start, mid - 1);
                }
            }
            return ans;
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int[][] arr = {
                { 10, 20, 15 },
                { 21, 30, 14 },
                { 7, 16, 32 } };
        // int[][] arr = {{1,4},{3,2}};
        System.out.println(Arrays.toString(findPeakGrid(arr)));
    }
}
