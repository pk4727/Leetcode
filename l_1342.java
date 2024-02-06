package leetcode;

class l_1342 {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(123));
    }

    static int numberOfSteps(int num) {
        return helper(num, 0);
    }

    private static int helper(int n, int steps) {
        if (n == 0) {
            return steps;
        }
        if (n % 2 == 0) {
            return helper(n / 2, steps + 1);
        }
        return helper(n - 1, steps + 1);
    }
}