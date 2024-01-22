import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> person = new ArrayList<>();
        person.add(new Employee("Ivan", "Adaev", "Senior-developer", 20000.00));
        person.add(new Employee("Beka", "Jones", "SEO", 45640.45));
        person.add(new Student("John", "Tolegenov", 1.45));
        person.add(new Student("Max", "Ivanov", 3.16));
        Collections.sort(person);
        printData(person);
    }
    public static void printData(Iterable<Person> person) {
        for (Person people : person) {
            System.out.println(people + " earns " + people.getPaymentAmount() + " tenge");
        }
    }
}