package polytech.medium;

import java.util.*;

public class WordsModifier {

    public boolean modifyWord(String word, String anotherWord) {
        List<String> list = new ArrayList<>(List.of(word.split("")));
        List<String> anotherList = new ArrayList<>(List.of(anotherWord.split("")));
        Queue<String> queue = new LinkedList<>();
        for (String s : list) {
            queue.offer(s);
        }
        int wordsLengthComp = Math.abs(list.size() - anotherList.size());
        int count = 0;
        for (String s : anotherList) {
            if (word.contains(anotherWord) && wordsLengthComp == 1) {
                break;
            }
            if (s.equals(queue.peek())) {
                queue.poll();
                if (s.equals(queue.peek())) {
                    queue.poll();
                    count += 1;
                    continue;
                }
                continue;
            } else {
                if (wordsLengthComp == 0) {
                    queue.poll();
                }
                count += 1;
            }
            if (count == 2) {
                break;
            }
        }
        return count <= 1;
    }
}
