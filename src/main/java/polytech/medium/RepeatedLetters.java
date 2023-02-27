package polytech.medium;

import java.util.*;
import java.util.stream.Collectors;

public class RepeatedLetters {
    public String deleteRepeatedLetters(String str) {
        List<String> list = new LinkedList<>(List.of(str.split("")));
        for (int i = 0; i < list.size() - 1; i++) {
            if (Objects.equals(list.get(i), list.get(i + 1))) {
                list.remove(list.get(i));
                list.remove(list.get(i));
                i = -1;
            }
        }
        return list.stream().map(String::valueOf)
                .collect(Collectors.joining(""));
    }
}
