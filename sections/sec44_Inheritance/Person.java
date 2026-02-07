package sections.sec44_Inheritance;

public class Person {
    private String name;
    private String city;

    public Person(String name, String address) {
        this.name = name;
        this.city = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return city;
    }

    public String toString() {
        return name + " - " + city;
    }
}
