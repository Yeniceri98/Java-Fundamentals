package sections.sec51_Interface;

public class Fish implements Prey, Predator {       // 2 interface'i de implemente ediyor
    @Override
    public void hunt() {
        System.out.println("The fish is hunting");
    }

    @Override
    public void flee() {
        System.out.println("The fish is fleeing");
    }
}
