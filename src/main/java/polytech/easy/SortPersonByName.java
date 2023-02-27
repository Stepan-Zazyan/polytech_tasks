package polytech.easy;

import java.util.Comparator;

public class SortPersonByName implements Comparator<Person> {
    @Override
    public int compare(Person left, Person right) {
        return left.getName().compareTo(right.getName());
    }
}
