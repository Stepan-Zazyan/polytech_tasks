package polytech.medium;

import java.util.*;

public class RepeatedLetters {

    public String deleteRepeatedLetters(String str) {
        List<String> list = new ArrayList<>(List.of(str.split("")));
        Stack<String> stack = new Stack<>();
        Stack<String> st = new Stack<>();
        for (String s : list) {
            stack.push(s);
        }
        while (!stack.empty()) {
            if (!st.empty()) {
                while (!st.empty()) {
                    if (!stack.empty() && Objects.equals(st.peek(), stack.peek())) {
                        st.pop();
                        stack.pop();
                    } else {
                        break;
                    }
                }
            }
            if (!stack.empty()) {
                String s = stack.pop();
                if (!stack.empty() && Objects.equals(s, stack.peek())) {
                    stack.pop();
                } else {
                    st.push(s);
                }
            }
        }
        String result = "";
        while (!st.empty()) {
            result += st.pop();
        }
        return result;
    }
}
