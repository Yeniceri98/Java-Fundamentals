package sections.sec46_Polymorphism;

public class Car extends Vehicle {
    @Override       // Yazılması zorunlu değildir
    public void go() {
        System.out.println("Car is moving");
    }
}

// Subclass
