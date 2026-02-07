package sections.sec44_Inheritance;

public class Teacher extends Person {
    int salary;

    public Teacher(String name, String city, int salary) {
        super(name, city);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + " -> " + "Salary " + salary + " euro";
    }
}
