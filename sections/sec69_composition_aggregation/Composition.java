package sections.sec69_composition_aggregation;

class Engine {
    public void start() {
        System.out.println("Engine started");
    }
}

class Car {
    private Engine engine;      // Engine class'ı Car class'ının bir parçası

    public Car() {
        engine = new Engine();  // Yeni bir Engine objesi oluşturuluyor
    }

    public void startCar() {
        engine.start();
        System.out.println("Car started");
    }
}

public class Composition {
    public static void main(String[] args) {
        Car car = new Car();
        car.startCar();
    }
}

/*
    Composition, bir sınıfın başka bir sınıfı içermesi ve bu ilişkinin "sahiplik" ilişkisi olduğu bir durumu ifade eder
    Yani, bir nesne diğer nesnesinin yaşam döngüsünden sorumludur
    Kapsayan nesne yok edildiğinde, bileşen nesne de yok edilmiş olur

    Yukarıdaki örneğe göre Car sınıfı yok edilirse Engine nesnesi de yok edilmiş olur
    Çünkü Engine nesnesi Car sınıfının constructor'ında oluşturuluyor
*/