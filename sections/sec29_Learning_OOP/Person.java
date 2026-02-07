package sections.sec29_Learning_OOP;

public class Person {
    private String name;
    private int age;
    private double weight;
    private double height;

    public Person(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public double bodyMassIndex() {
        return weight / (height * height);
    }

    public double maximumHearthRate() {
        return 206.3 - (0.711 * this.age);
    }

    public String toString() {
        return name + ", BMI " + bodyMassIndex() + ", maximum hearth rate: " + maximumHearthRate();
    }
}
