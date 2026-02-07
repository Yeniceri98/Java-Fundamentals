package sections.sec43_Method_Overriding;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();

        animal.speak();
        dog.speak();        // Dog class'ında "speak" adında aynı isimde oluşturup overrideladığımız bir metod olmasaydı Animal class'ındakli metodu çalıştırırdı
    }
}

/*
    Method Overloading
    Declaring a method in sub class which is already present in parent class
    Child class can give its own implementation
*/
