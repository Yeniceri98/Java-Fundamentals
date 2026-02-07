package sections.sec50_Encapsulation;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Renault", "Megane", 2006);

        // System.out.println(car.brand);     // "Car" class'ında variable tanımlamaları private olduğu için bu şekilde erişemeyiz. Erişim için getter kullanılır

        System.out.println(car.getBrand());
        System.out.println(car.getModel());
        System.out.println(car.getYear());

        // car.brand = "BMW";       // private variable'ın değerini değiştirirken setter kullanılmalıdır

        car.setBrand("BMW");

        System.out.println(car.getBrand());
    }
}

/*
    Attributes of a class will be hidden or private
    Can be accessed only through methods (getters & setters)
    You should make attributes private if you don't have a reason to make them public or protected
*/
