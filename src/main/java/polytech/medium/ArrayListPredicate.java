package polytech.medium;

import java.util.function.Predicate;

public class ArrayListPredicate {

    private int size;
    private Integer[] array;

    public ArrayListPredicate(int size, Integer[] array) {
        this.size = size;
        this.array = array;
    }

    /*use stack??
     * */
    public void deleteAll(Predicate<Integer> predicate) {
        if (size == 0) {
            throw new IllegalArgumentException("Задайте размер массива.");
        }
        int filteredIndex = 0;
        int sem = 0;
        for (int i = 0; i < size; i++) {
            if (sem == 1) {
                array[i - 1] = array[i];
            }
            if (predicate.test(array[i])) {
                sem = 1;
                filteredIndex++;
            } else {
                array[i - filteredIndex] = array[i];
                sem = 0;
            }
        }
        for (int i = size - 1; i >= size - filteredIndex; i--) {
            array[i] = null;
        }
    }

    public Integer[] getArray() {
        return array;
    }

}
