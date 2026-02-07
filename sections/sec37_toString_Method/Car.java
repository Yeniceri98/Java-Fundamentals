package sections.sec37_toString_Method;

public class Car {
    String brand;
    String model;
    String color;

    public Car(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    public String toString() {
        return brand + " - " + model + " - " + color;
    }
}
