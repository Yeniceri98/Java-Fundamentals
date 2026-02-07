package sections.sec51b_Interface_Default_Method;

interface Vehicle {
    void start();

    // Car classında bu metodu @Override etmedik ve burada yazılan satır print edilmiş oldu
    default void stop() {
        System.out.println("Vehicle is stopped");
    }

    // Car classında bu metodu @Override ettik ve orada yazılan satır print edilmiş oldu
    default void crash() {
        System.out.println("Vehicle is crashed");
    }
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is started");
    }

    @Override
    public void crash() {
        System.out.println("Car is crashed");
    }
}
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();    // Car is started
        car.stop();     // Vehicle is stopped
        car.crash();    // Car is crashed
    }
}

/*
    Java 8 ve sonraki sürümlerinde, interface'lerde "default" metotlar tanımlama özelliği eklenmiştir
    Bu, bir interface'in içinde metot gövdelerine sahip olabileceğiniz anlamına gelir
    Interface'de default anahtar kelimesi ile tanımlanan metotlar, varsayılan bir uygulama içerir ve interface'i uygulayan sınıflar tarafından kullanılabilir
*/
