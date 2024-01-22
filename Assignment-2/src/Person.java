public class Person implements Payable, Comparable<Person> {
    private int id;
    private static int id_generator = 1;
    private String name;
    private String surname;
    Person() {
        id = id_generator++;
    }
    Person(String name, String surname) {
        this();
        setName(name);
        setSurname(surname);
    }

    @Override
    public double getPaymentAmount() {
        return 0;
    }
    public String getPosition() {
        return "Student";
    }
    @Override
    public String toString() {
        return id + ". " + name + " " + surname;
    }
    @Override
    public int compareTo(Person other) {
        return Double.compare(this.getPaymentAmount(), other.getPaymentAmount());
    }
    public int getId() {
        return id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getSurname() {
        return surname;
    }
}
