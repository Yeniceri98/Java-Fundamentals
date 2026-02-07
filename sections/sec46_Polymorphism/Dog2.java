package sections.sec46_Polymorphism;

public class Dog2 extends Animal {
    private int breed;

    // Polymorphism
    public void eat() {
        System.out.println("chomp chomp");
    }

    // Overloading
    public void eat(int numberOfTimes) {
        for (int i = 0; i < numberOfTimes; i++) {
            System.out.println("chomp chomp");
        }
    }

    public int getBreed() {
        return breed;
    }

    public void setBreed(int breed) {
        this.breed = breed;
    }
}
