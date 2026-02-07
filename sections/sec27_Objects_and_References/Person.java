package sections.sec27_Objects_and_References;

public class Person {
    private String name;
    private int age;
    private int weight;
    private int height;

    public Person(String name) {
        this(name, 0, 0, 0);        // Kısa yoldan age, weight, height'a default 0 başlangıç değeri verildi
    }

    public Person(String name, int age, int weight, int height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void growOlder() {
        age++;
    }

    public double bodyMassIndex() {
        double hightPerHundred = height / 100.0;
        return weight / (hightPerHundred * hightPerHundred);
    }

    public String toString() {
        return name + " is " + age + " years old...";
    }
}
