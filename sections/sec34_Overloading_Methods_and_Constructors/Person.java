package sections.sec34_Overloading_Methods_and_Constructors;

public class Person {
    private String name;
    private int age;
    private int height;
    private int weight;

    // All person objects are 0 years old when created.
    // This is because the constructor sets the value of the instance variable age to 0:
    public Person(String name) {
        this.name = name;
        this.age = 0;
        this.height = 0;
        this.weight = 0;
    }

    // Constructor Overloading
    // We would also like to be able to create persons so that the constructor is provided both the age as well as the name as parameters.
    // This is possible since a class may have multiple constructors
    // We'll have 2 alternative ways to create objects in this way (Serialization.java'da tanımlarken)
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.height = 0;
        this.weight = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void printPerson() {
        System.out.println(name + " is " + age + " years old");
    }

    // Method Overloading
    public void growOlder() {
        age++;
    }

    // Once again, the parameters of the different versions must be different:
    public void growOlder(int years) {
        age = age + years;
    }

    public double bodyMassIndex() {
        double heightInMeters = height / 100.0;
        return weight / (heightInMeters * heightInMeters);
    }

    public String toString() {
        return name + " is " + age + " years old. His/her BMI is " + bodyMassIndex();
    }
}
