public class l_14 {
    public static void main(String[] args) {

        String[] str = { "flower", "flow", "fliwght" };
        System.out.println(longestCommonPrefix(str));
        System.out.println(longestCommonPrefix2(str));
    }

    public static String longestCommonPrefix(String[] strs) { // efficient
        if (strs == null || strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for (String s : strs) {
            while (s.indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }

    public static String longestCommonPrefix2(String[] str) { // less efficient
        String ans = "";
        String s = str[0];
        for (int i = 0; i < s.length(); i++) { // in string list
            char ch = s.charAt(i);
            String ss = String.valueOf(ch);
            for (int j = 1; j < str.length; j++) { // in string
                if (i < str[j].length() && str[j].charAt(i) == ch) {
                    if (ss.charAt(ss.length() - 1) != ch) {
                        ss += ch;
                    }
                } else {
                    ss = "";
                    return ans;
                }
            }
            ans += ss;
        }
        return ans;
    }
}
