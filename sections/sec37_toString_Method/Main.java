package sections.sec37_toString_Method;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Renault", "Megane", "Grey");

        System.out.println(car.toString());
        System.out.println(car);   // NOTE: toString() metodunu oluşturulduktan sonra yazdırırken toString() yazmamıza gerek yoktur
    }
}
