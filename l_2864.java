package leetcode;

public class l_2864 {
    public static void main(String[] args) {
        String s = "010";
        String ss = "1010";
        System.out.println(maximumOddBinaryNumber(s));
        System.out.println(maximumOddBinaryNumber(ss));
    }

    public static String maximumOddBinaryNumber(String s) {
        StringBuilder sb = new StringBuilder();
        int count1 = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                count1++;
            }
        }
        if (count1 == 0) {
            return "";
        }
        for (int i = 0; i < count1 - 1; i++) {
            sb.append(1);
        }
        for (int i = count1; i < s.length(); i++) {
            sb.append(0);
        }
        sb.append(1);
        return sb.toString();
    }
}