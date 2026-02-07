package sections.sec44_Inheritance;

public class Main2 {
    public static void main(String[] args) {
        Car car = new Car();
        Bicycle bike = new Bicycle();

        // Car ve Bicycle classlarında go() ve stop() metodları olmasa da inheritance sayesinde kullanabiliriz
        car.go();
        bike.stop();

        System.out.println(car.speed);
        System.out.println(car.doors);
        System.out.println(car.wheels);

        System.out.println(bike.speed);
        System.out.println(bike.wheels);
        System.out.println(bike.pedals);
    }
}
