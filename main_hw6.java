import java.util.Arrays;
import java.util.HashSet;

public class main_hw6 {
    public static void main(String[] args) {
        Person p1 = new Person(95, "Алексей", "Морозов", 46, "М");
        Person p2 = new Person(25, "Данис", "Зарипов", 42, "М");
        Person p3 = new Person(42, "Сергей", "Зиновьев", 43, "М");
        Person p4 = new Person(42, "Сергей", "Зиновьев", 43, "М");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());

        var persons = new HashSet<>(Arrays.asList(p1,p2,p3));
        System.out.println(persons);
        System.out.println(persons.contains(p4));

        System.out.println(p3.equals(p4));

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());
        System.out.println(p4.hashCode());
    }
}
