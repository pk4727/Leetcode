package Leetcode;

public class l_2485 {
    int pivotInteger(int n) {
        double totalsum = (double) (n * (n + 1)) / 2;
        double leftsum = 0;
        for (int i = 1; i <= n; i++) {
            leftsum += i;
            double rightsum = (totalsum + i) / 2;
            if (leftsum == rightsum) {
                return i;
            }
        }
        return -1;
    }

    int pivotInteger2(int n) {
        int leftsum = 0;
        for (int i = 1; i <= n; i++) {
            leftsum += i;
            int rightsum = 0;
            for (int j = i; j <= n; j++) {
                rightsum += j;
            }
            if (leftsum == rightsum) {
                return i;
            }
        }
        return -1;
    }
}