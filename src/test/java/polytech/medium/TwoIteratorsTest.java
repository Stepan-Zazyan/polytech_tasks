package polytech.medium;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class TwoIteratorsTest {

    @Test
    void checkFirstMoreThanSecond() {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> list2 = Arrays.asList(1, 2, 4, 5, 6, 8);
        Collections.sort(list1);
        Collections.sort(list2);
        ListIterator<Integer> it1 = list1.listIterator();
        ListIterator<Integer> it2 = list2.listIterator();
        List<Integer> actual = List.of(3, 7);
        List<Integer> res = new TwoIterators().retain(it1, it2);
        assertEquals(actual, res);
    }

    @Test
    void checkFirstLessThanSecond() {
        List<Integer> list1 = Arrays.asList(1, 3, 4, 5, 7);
        List<Integer> list2 = Arrays.asList(1, 2, 4, 5, 6, 8);
        Collections.sort(list1);
        Collections.sort(list2);
        ListIterator<Integer> it1 = list1.listIterator();
        ListIterator<Integer> it2 = list2.listIterator();
        List<Integer> actual = List.of(3, 7);
        List<Integer> res = new TwoIterators().retain(it1, it2);
        assertEquals(actual, res);
    }

    @Test
    void checkNinetyFive() {
        List<Integer> list1 = Arrays.asList(1, 3, 4, 95);
        List<Integer> list2 = Arrays.asList(1, 2, 4, 6, 8);
        Collections.sort(list1);
        Collections.sort(list2);
        ListIterator<Integer> it1 = list1.listIterator();
        ListIterator<Integer> it2 = list2.listIterator();
        List<Integer> actual = List.of(3, 95);
        List<Integer> res = new TwoIterators().retain(it1, it2);
        assertEquals(actual, res);
    }
}