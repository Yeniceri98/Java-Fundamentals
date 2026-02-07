package sections.sec70_upcasting_downcasting;

class Animal {
    public void awake() {
        System.out.println("Animal awake");
    }
}

class Dog extends Animal {
    public void awake() {
        System.out.println("Dog awake");
    }

    public void sleep() {
        System.out.println("Dog sleep");
    }
}
public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.awake();   // Animal awake

        // Upcasting
        Animal animal = new Dog();
        animal.awake();     // Dog awake
        // animal.sleep()   // NOTE: Sadece Dog class'ıda bulunan bir metoda erişemez

        // Downcasting
        Dog dog = (Dog) animal;
        dog.awake();        // Dog awake
        dog.sleep();        // Dog sleep
    }
}

/*
    Upcasting, bir nesnenin alt sınıf türünden üst sınıf türüne dönüştürülmesidir
    Alt sınıf nesnesi, üst sınıf türüne dönüştürülürken veri kaybı veya değişiklik olmaz
    Upcasting, polimorfizmin kullanımını sağlar ve kodun daha genel ve esnek olmasına yardımcı olur
    Alt sınıfın tüm özelliklerine (metotlar, değişkenler) erişim sağlanamaz; sadece üst sınıfın tanımladığı özellikler kullanılabilir

    Downcasting, bir nesnenin üst sınıf türünden alt sınıf türüne dönüştürülmesidir
    Alt sınıf türüne dönüştürme için nesnenin gerçekten o alt sınıf türünde olması gereklidir
    Tür dönüştürmesi sırasında nesnenin gerçek türünü kontrol etmek için "instanceof" operatörü kullanılabilir

    Sonuç olarak, upcasting ve downcasting, sınıflar arasındaki miras ilişkilerini kullanarak nesnelerin türlerini dönüştürmeye yarayan önemli kavramlardır
    Upcasting genellikle güvenli ve yaygınken, downcasting dikkatle yapılmalıdır
*/
