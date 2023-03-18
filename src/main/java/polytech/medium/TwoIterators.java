package polytech.medium;

import java.util.*;

public class TwoIterators {
    public List<Integer> retain(ListIterator<Integer> it1, ListIterator<Integer> it2) {
        List<Integer> res = new ArrayList<>();
        while (it1.hasNext() && it2.hasNext()) {
            if (Objects.equals(it1.next(), it2.next())) {
                continue;
            }
            it1.previous();
            it2.previous();
            if ((it1.next()) < (it2.next())) {
                it1.previous();
                if (!res.contains(it1.next())) {
                    it1.previous();
                    res.add(it1.next());
                }
                it2.previous();
                continue;
            }
            it1.previous();
            it2.previous();
            if (it1.next() > it2.next()) {
                if (!it1.hasNext()) {
                    it1.previous();
                    res.add(it1.next());
                } else {
                    it1.previous();
                }
            }
        }
        return res;
    }
}
