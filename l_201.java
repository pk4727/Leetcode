package leetcode;

public class l_201 {

    public static int rangeBitwiseAnd2(int left, int right) {
        int ans = left & right;
        for (int i = left + 1; i < right; i++) {
            ans = left & i;
        }
        return ans;
    }

    public static int rangeBitwiseAnd1(int left, int right) {
        int shift = 0;
        while (left < right) {
            left >>= 1;
            right >>= 1;
            shift++;
        }
        return left << shift;
    }

    public static void main(String[] args) {
        System.out.println(rangeBitwiseAnd1(5, 7));
        System.out.println(rangeBitwiseAnd1(5, 7));
    }
}