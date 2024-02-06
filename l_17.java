package leetcode;
import java.util.ArrayList;
import java.util.List;

public class l_17 {
    public static void main(String[] args) {
        System.out.println(letterCombinations("7"));
    }

    static List<String> letterCombinations(String digits) {
        if(digits.length()==0){
            return new ArrayList<>();
        }
        return (mobile_pad_permutation("",digits));
    }

    static List<String> mobile_pad_permutation(String p, String unp) {
        if (unp.isEmpty()) {
            List<String> pp = new ArrayList<>();
            pp.add(p);
            return pp;
        }
        int digit = unp.charAt(0) - '1';
        List<String> ans = new ArrayList<>();
        if (digit < 6) { // work for 2 to 6
            for (int i = (digit - 1) * 3; i < digit * 3; i++) {
                char ch = (char) ('a' + i);
                List<String> result = mobile_pad_permutation(p + ch, unp.substring(1));
                ans.addAll(result);
            }
        }
        if (digit == 6) {// work for 7
            for (int i = (digit - 1) * 3; i < digit * 3 + 1; i++) {
                char ch = (char) ('a' + i);
                List<String> result = mobile_pad_permutation(p + ch, unp.substring(1));
                ans.addAll(result);
            }
        }
        if (digit == 7) {// work for 8
            for (int i = (digit - 1) * 3; i < digit * 3; i++) {
                char ch = (char) ('a' + i + 1);
                List<String> result = mobile_pad_permutation(p + ch, unp.substring(1));
                ans.addAll(result);
            }
        }
        if (digit == 8) {// work for 9
            for (int i = (digit - 1) * 3; i < digit * 3 + 1; i++) {
                char ch = (char) ('a' + i + 1);
                List<String> result = mobile_pad_permutation(p + ch, unp.substring(1));
                ans.addAll(result);
            }
        }
        return ans;
    }
}
