package sections.sec46_Polymorphism;

public class MainAnotherExample {
    public static void main(String[] args) {
        Animal3 animal = new Animal3();
        Animal3 cat = new Cat3();
        Animal3 dog = new Dog3();

        animal.animalSound();
        cat.animalSound();
        dog.animalSound();
    }
}

// Parent Class
class Animal3 {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

// Subclass
class Cat3 extends Animal3 {
    public void animalSound() {
        System.out.println("The cat makes a sound");
    }
}

// Subclass
class Dog3 extends Animal3 {
    public void animalSound() {
        System.out.println("The dog makes a sound");
    }
}
