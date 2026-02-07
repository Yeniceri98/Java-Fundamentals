package sections.sec44_Inheritance;

public class Superclass {
    private String objectVariable;

    public Superclass() {
        this("Example");
    }

    public Superclass(String value) {
        objectVariable = value;
    }

    public String toString() {
        return objectVariable;
    }
}
