package leetcode;

import java.util.ArrayList;

public class l_451 {
    public static void main(String[] args) {
        l_451 r = new l_451();
        String s = "raaeaedere";
        System.out.println(r.frequencySort(s));
    }

    public String frequencySort(String s) {
        ArrayList<String> substring = subString(s);
        String ans = "";
        while (!substring.isEmpty()) {
            int index = 0;
            int max = substring.get(0).length();
            String ms = substring.get(0);
            for (int i = 0; i < substring.size(); i++) {
                if (max < substring.get(i).length()) {
                    max = substring.get(i).length();
                    ms = substring.get(i);
                    index = i;
                }
            }
            ans += ms;
            substring.remove(index);
        }
        return ans;
    }

    public ArrayList<String> subString(String s) {
        ArrayList<String> substring = new ArrayList<>();
        while (!s.isEmpty()) {
            String first = s.substring(0, 1);
            s = s.substring(1);
            for (int j = 0; j < s.length(); j++) {
                if (first.charAt(0) == s.charAt(j)) {
                    String f = s.substring(j, j + 1);
                    first += f;
                    String s1 = s.substring(0, j);
                    String s2 = s.substring(j + 1, s.length());
                    s = s1 + s2;
                    j--;
                }
            }
            substring.add(first);
        }
        return substring;
    }
}