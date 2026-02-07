package sections.sec34_Overloading_Methods_and_Constructors;

public class Product {
    private String name;
    private String location;
    private int weight;

    public Product(String name) {
        this.name = name;
        this.location = "Shelf";
        this.weight = 1;
    }

    public Product(String name, String location) {
        this.name = name;
        this.location = location;
        this.weight = 1;
    }

    public Product(String name, int weight) {
        this.name = name;
        this.location = "Shelf";
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getWeight() {
        return weight;
    }

    public String toString() {
        return name + " - " + location + " - " + weight;
    }
}
