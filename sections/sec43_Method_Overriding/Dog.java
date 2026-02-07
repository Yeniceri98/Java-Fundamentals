package sections.sec43_Method_Overriding;

public class Dog extends Animal {

    @Override           // Eklemek zorunda değiliz fakat overrideladığımızı belirtmek için best practice olarak kullanılır
    void speak() {
        System.out.println("Dog is barking");
    }
}
