package polytech.easy;

import java.util.Arrays;
import java.util.Objects;

public class EasyMethods {

    public static void main(String[] args) {
        Objects.checkIndex(1, 5);
        System.out.println("Метод swap");
        int[] array = {1, 2, 3, 4, 5};
        int a = 1;
        int b = 4;
        boolean resultTrue = swap(a, b, array);
        System.out.println(resultTrue);
        System.out.println(Arrays.toString(array));
        boolean resultFalse = swap(-1, b, array);
        System.out.println(resultFalse);
        System.out.println();
        System.out.println("Метод min");
        System.out.println(min(-1, -2, -3));
        System.out.println(min(-1, -2, 3));
        System.out.println(min(-1, 2, 3));
    }

    public static boolean swap(int a, int b, int[] array) {
        boolean rsl = true;
        if (a < 0 || b < 0 || a >= array.length || b >= array.length) {
            rsl = false;
        } else {
            int z = array[a];
            array[a] = array[b];
            array[b] = z;
        }
        return rsl;
    }

    public static int min(int a, int b, int c) {
        int min = a;
        if (b < a) {
            min = b;
        }
        if (c < b) {
            min = c;
        }
        return min;
    }
}
