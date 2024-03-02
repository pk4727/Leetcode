package leetcode;

public class l_279 {

    public int numSquares(int n) {
        if (isPsquare(n)) {
            return 1;
        }
        for (int i = 1; i * i <= n; i++) {
            if (isPsquare(n - (i * i))) {
                return 2;
            }
        }
        while (n % 4 == 0) {
            n /= 4;
        }
        if (n % 8 == 7) {
            return 4;
        }
        return 3;
    }

    public boolean isPsquare(int s) {
        int s1 = (int) Math.sqrt(s);
        if (s1 * s1 == s) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        l_279 r = new l_279();
        System.out.println(r.numSquares(10));
    }
}