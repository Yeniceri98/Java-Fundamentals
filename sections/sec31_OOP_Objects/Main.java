package sections.sec31_OOP_Objects;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        Car myCar2 = new Car();

        System.out.println(myCar.make);
        System.out.println(myCar.year);
        myCar.drive();
        myCar.brake();

        System.out.println(myCar2.color);
        System.out.println(myCar2.price);
        myCar2.drive();

    }
}
