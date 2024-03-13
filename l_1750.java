package Leetcode;

public class l_1750 {
    public static int minimumLength(String s) {
        if (s.length() == 1)
            return 1;
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            while (start + 1 < end && s.charAt(start) == s.charAt(start + 1))
                start++;
            while (end - 1 > start && s.charAt(end) == s.charAt(end - 1))
                end--;
            if (s.charAt(start) == s.charAt(end))
                s = s.substring(start + 1, end);
            else
                return s.length();
            start = 0;
            end = s.length() - 1;
        }
        return s.length();
    }

    public static int minimumLength1(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start < end && s.charAt(start) == s.charAt(end)) {
            char ch = s.charAt(start);
            while (start < end && s.charAt(start) == ch)
                start++;
            while (start <= end && s.charAt(end) == ch)
                end--;
        }
        return end - start + 1;
    }

    public static void main(String[] args) {
        minimumLength("aabccdbba");
    }
}