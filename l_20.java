package leetcode;

import java.util.Objects;
import java.util.Stack;

public class l_20 {
    public boolean isValid(String s) {
        Stack<String> st = new Stack<>();
        if (s.isEmpty()) {
            return false;
        }
        st.push("x");
        st.push(s.substring(0, 1));
        s = s.substring(1);
        while (!s.isEmpty()) {
            String temp = s.substring(0, 1);
            if (temp.equals(")") && Objects.equals(st.peek(), "(") && !Objects.equals(st.peek(), "x")) {
                st.pop();
                s = s.substring(1);
            } else if (temp.equals("}") && Objects.equals(st.peek(), "{") && !Objects.equals(st.peek(), "x")) {
                st.pop();
                s = s.substring(1);
            } else if (temp.equals("]") && Objects.equals(st.peek(), "[") && !Objects.equals(st.peek(), "x")) {
                st.pop();
                s = s.substring(1);
            } else {
                st.push(temp);
                s = s.substring(1);
            }
        }
        if (!Objects.equals(st.peek(), "x")) {
            return false;
        }
        return true;
    }
}

class run {
    public static void main(String[] args) {
        l_20 q = new l_20();
        System.out.println(q.isValid("()"));
        System.out.println(q.isValid("()[]{}"));
        System.out.println(q.isValid("(]"));
    }
}