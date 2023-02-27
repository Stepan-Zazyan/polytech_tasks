package polytech.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonList {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Игорь", "Валеев", 15));
        list.add(new Person("Олег", "Алеев", 16));
        list.add(new Person("Игорь", "Валеев", 5));
        list.add(new Person("Антон", "Иванов", 44));
        list.add(new Person("Степан", "Зазян", 32));
        list.add(new Person("Инокентий", "Смоктуновский", 155));
        list.add(new Person("Владимир", "Путин", 70));
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        list.sort(new SortPersonByAge());
        System.out.println(list);
        list.sort(new SortPersonBySurname());
        System.out.println(list);
    }
}
