public class Student extends Person {
    private double gpa;
    private static final double stepiend = 36660.00;
    Student() {
        super();
    }
    Student(String name, String surname, double gpa) {
        super(name, surname);
        setGpa(gpa);
    }
    @Override
    public String toString() {
        return "Student: " + super.toString();
    }

    @Override
    public double getPaymentAmount() {
        return (gpa > 2.67) ? stepiend : 0.0;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public double getGpa() {
        return gpa;
    }
}
