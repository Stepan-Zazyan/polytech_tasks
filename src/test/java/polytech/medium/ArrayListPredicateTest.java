package polytech.medium;

import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class ArrayListPredicateTest {

    @Test
    void checkMoreThanThree() {
        ArrayListPredicate ar = new ArrayListPredicate(10, new Integer[]{1, 3, 5, 1, 6, 2, 3, 7, 7, 3});
        ar.deleteAll(s -> s > 3);
        Integer[] result = {1, 3, 1, 2, 3, 3, null, null, null, null};
        assertArrayEquals(result, ar.getArray());
        assertEquals(result.length, ar.getArray().length);
    }

    @Test
    void checkIfElementIsNull() {
        ArrayListPredicate ar = new ArrayListPredicate(10, new Integer[]{1, 3, 5, null, 6, 2, 3, 7, 7, 3});
        ar.deleteAll(Objects::isNull);
        Integer[] result = {1, 3, 5, 6, 2, 3, 7, 7, 3, null};
        assertArrayEquals(result, ar.getArray());
        assertEquals(result.length, ar.getArray().length);
    }

    @Test
    void checkExceptionArrayZeroSize() {
        ArrayListPredicate ar = new ArrayListPredicate(0, new Integer[]{});
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class, () -> ar.deleteAll(s -> s.equals(Integer.parseInt(""))));
        assertThat(exception.getMessage()).isEqualTo("Задайте размер массива.");
    }
}