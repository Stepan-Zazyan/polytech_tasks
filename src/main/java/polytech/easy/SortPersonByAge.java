package polytech.easy;

import java.util.Comparator;

public class SortPersonByAge implements Comparator<Person> {
    @Override
    public int compare(Person left, Person right) {
        return Integer.compare(left.getAge(), right.getAge());
    }
}
