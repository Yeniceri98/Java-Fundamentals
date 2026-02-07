package sections.sec41_Copy_Objects;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Renault", "Megane", 2006);
        Car car2 = new Car("Ford", "Mustang", 2020);

        // car1 = car2;                 // Bu şekilde yaparsak her ikisinin adresi de aynı olur ve dolayısıyla aynı çıktıları verir

        // Metod Kullanarak Kopyalama
        car2.copyMethod(car1);          // car2 objesinin değerleri car1 ile aynı oldu fakat bu kez referansları olması gerektiği gibi farklı

        // Metod + Constructor Kullanarak Kopyalama
        Car car3 = new Car(car1);       // Bu kez direkt obje oluştururken car1 objesinin kopyasını aldık. Bunun için "Car" class'ında yeni bir constructor oluşturduk

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println();
        System.out.println(car1.getBrand());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        System.out.println();
        System.out.println(car2.getBrand());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());
        System.out.println();
        System.out.println(car3.getBrand());
        System.out.println(car3.getModel());
        System.out.println(car3.getYear());
    }
}
