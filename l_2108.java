package leetcode;

public class l_2108 {
    public String firstPalindrome(String[] words) {
        for (String i : words) {
            if (isPalindrom(i)) {
                System.out.println(i);
                return i;
            }
        }
        return "";
    }

    public boolean isPalindrom(String s) {
        String temp = s;
        String rev = "";
        while (!s.isEmpty()) {
            rev = s.substring(0, 1) + rev;
            s = s.substring(1);
        }
        return rev.equals(temp);
    }

    public static void main(String[] args) {
        l_2108 b = new l_2108();
        String[] s = { "shdufb", "bdfhvbdf", "123321" };
        b.firstPalindrome(s);
    }
}
