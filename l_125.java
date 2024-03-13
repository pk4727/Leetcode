package Leetcode;

public class l_125 {

    public static boolean isPalindrome(String str) {
        boolean ans = true;
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (Character.isAlphabetic(ch) || Character.isDigit(ch)) {
                s.append(ch);
            }
        }
        System.out.println(s);
        return xx(0, s.toString(), s.length() - 1, ans);
    }

    public static boolean xx(int start, String str, int end, boolean ans) {
        if (start >= end) {
            return ans;
        }
        if (str.charAt(start) != str.charAt(end)) {
            ans = false;
        }
        return xx(start + 1, str, end - 1, ans);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("0p"));
    }
}
