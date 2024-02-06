package leetcode;

public class l_1672 {
    public static void main(String[] args) {
        int[][] arr2 = {{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(arr2));
    }

    static int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int i = 0; i < accounts.length; i++) {
            int salary = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                salary += accounts[i][j];
            }
            if (salary > max) {
                max = salary;
            }
        }
        return max;
    }
}