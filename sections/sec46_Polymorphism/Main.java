package sections.sec46_Polymorphism;

public class Main {
    public static void main(String[] args) {
        // Animal as superclass and Dog as subclass (No Polymorphism used)
        Animal animal = new Animal();
        animal.eat();           // Output: munch

        Dog dog = new Dog();
        dog.eat();              // Output: munch

        /*
            Yukarıdaki örnekte Dog subclass'ında Animal'ı extends ettikten sonra Animal'a ait eat() metodunu kullanabildik
            Her ikisi de eat() metodunda aynı şeyi yazdırdı
            Polymorphism kullanarak Subclass'da eat() metodu oluşturulup farklı bir çıktı alınması sağlanabilir
            Bu işlemi Dog2 classında yaptık
        */
        Animal animal2 = new Animal();
        animal2.eat();                   // Output: munch

        Dog2 dog2 = new Dog2();
        dog2.eat();                      // Output: chomp chomp
        dog2.eat(3);                     // Overloadlanan metod


        // Dynamic Polymorphism
        System.out.println("Reference: Animal /// Object: dog2");
        Animal myAnimal = new Dog2();
        myAnimal.eat();                 // Output: chomp chomp


        // Example: "Employee" as superclass and "Manager" as subclass
        Employee employee = new Manager("Ahmet", "CE", 4000, 10);       // Bu şekilde de yapabiliyoruz
        employee.showInfos();
    }
}
