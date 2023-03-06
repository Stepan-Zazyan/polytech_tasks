package polytech.medium;

import java.util.*;
import java.util.stream.Collectors;

public class RepeatedLetters {
    public static void main(String[] args) {
    }

    public String deleteRepeatedLetters(String str) {
        List<String> list = new ArrayList<>(List.of(str.split("")));
        Stack<String> stack = new Stack<>();
        for (String s : list) {
            if (!stack.empty() && Objects.equals(stack.peek(), s)) {
                stack.pop();
            } else {
                stack.push(s);
            }
        }
        return stack.stream().map(String::valueOf)
                .collect(Collectors.joining(""));
    }
}
