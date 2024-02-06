package leetcode;

public class l_2169 {
    public static void main(String[] args) {
        System.out.println(countOperations(2, 3));
    }

    static int countOperations(int num1, int num2) {
        return helpeer(num1, num2, 0);
    }

    static int helpeer(int n1, int n2, int steps) {
        if (n1 == 0 | n2 == 0) {
            return steps;
        }
        if (n1 > n2) {
            return helpeer(n1 - n2, n2, steps + 1);
        }
        return helpeer(n1, n2 - n1, steps + 1);
    }
}
