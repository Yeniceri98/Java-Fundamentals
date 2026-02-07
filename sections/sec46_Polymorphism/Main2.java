package sections.sec46_Polymorphism;

public class Main2 {
    public static void main(String[] args) {
         Car car = new Car();
         Bicycle bicycle = new Bicycle();
         Boat boat = new Boat();

         Vehicle[] racers = {car, bicycle, boat};

//         car.go();
//         bicycle.go();
//         boat.go();           tek tek yazmak yerine for loop kullanmak daha mantıklı

        for (Vehicle x : racers) {
            x.go();
        }
    }
}
