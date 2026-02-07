package sections.sec27_Objects_and_References;

public class Person2 {
    private String name;
    // private int age;             // age'i artık böyle almaya gerek yok. SimpleDate class'ında gün-ay-yıl olarak tuttuk
    private SimpleDate birthday;    // The variable "birthday" is a "SimpleDate" object.
    private int weight;
    private int height;

    public Person2(String name, SimpleDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    // Along with the constructor above, we could give Person another constructor where the birthday was given as integers:
    public Person2(String name, int day, int month, int year) {
        this.name = name;
        this.birthday = new SimpleDate(day, month, year);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SimpleDate getBirthday() {
        return birthday;
    }

    public void setBirthday(SimpleDate birthday) {
        this.birthday = birthday;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean olderThan(Person2 compared) {
        if (birthday.before(compared.getBirthday())) {     // SimpleDate class'ından "before" metodu çekildi. İlk başta private SimpleDate birthday; şeklinde variable olarak tanımlamıştık
            return true;
        }
        return false;
    }

    public String toString() {
        return name + " is born on " + birthday;
    }
}
