package polytech.easy;

public class Person implements Comparable<Person> {
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{"
                + "name='" + name + '\''
                + ", surname='" + surname + '\''
                + ", age=" + age
                + '}';
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public int compareTo(Person o) {
        return this.getName().compareTo(o.getName());
    }

    public int getAge() {
        return age;
    }
}
