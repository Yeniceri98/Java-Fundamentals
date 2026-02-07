package sections.sec49_Abstraction;

public class Main {
    public static void main(String[] args) {
        // Vehicle vehicle = new Vehicle();     // Abstract class'ları bu şekilde tanımlayamayız
        Car car = new Car();

        car.go();
    }
}

/*
    Abstract classes cannot be instantiated but they can have a subclass
    Abstract methods are declared without an implementation
    Abstract methods don't have a (abstract keyword konulan)
    It's mainly used for security purposes
*/
