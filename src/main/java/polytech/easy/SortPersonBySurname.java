package polytech.easy;

import java.util.Comparator;

public class SortPersonBySurname implements Comparator<Person> {
    @Override
    public int compare(Person left, Person right) {
        return left.getSurname().compareTo(right.getSurname());
    }
}
