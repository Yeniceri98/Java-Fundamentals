package sections.sec35_Overloaded_Constructors;

public class Pizza {
    String name;
    String size;
    int degree;

    public Pizza(String name) {
        this.name = name;
    }

    public Pizza(String name, String size, int degree) {
        this.name = name;
        this.size = size;
        this.degree = degree;
    }
}
