package sections.sec28_Objects_On_The_List;

public class Person2 {
    private String name;
    private int height;

    public Person2(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public String toString() {
        return name + " - " + height;
    }
}

