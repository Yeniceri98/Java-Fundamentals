package sections.sec51_Interface;

public class Main {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();

        rabbit.flee();
        hawk.hunt();
        fish.flee();
        fish.hunt();

    }
}

/*
    Interface is a template that can be applied to a class
    It's similar to inheritance but specifies what a class has/must do
    Classes can apply more than one interface, inheritance is limited to 1 superclass
*/
/*
    Interface vs Abstract Class
    https://www.guru99.com/interface-vs-abstract-class-java.html
    https://www.javatpoint.com/difference-between-abstract-class-and-interface
*/
