package sections.sec44_Inheritance;

public class Student extends Person {
    private int credits;

    public Student(String name, String city) {
        super(name, city);
        this.credits = 0;
    }

    public int getCredits() {
        return credits;
    }

    public void study() {
        credits++;
    }

    // Aşağıdaki şekilde superclass'a ait olan toString() metodu override edilebilir. @Override annotation'ın yazılması şart değildir.
    @Override
    public String toString() {
        return super.toString() + " has " + credits + " credits";
    }
}
