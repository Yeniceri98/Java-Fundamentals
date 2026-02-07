package sections.sec23_Methods;

public class Intro {

    // Creating a Method
    /*
        A method must be declared within a class. It is defined with the name of the method, followed by parentheses ()
        Java provides some pre-defined methods, such as System.out.println(), but you can also create your own methods to perform certain actions:
        "static" means that the method belongs to the Serialization class and not an object of the Serialization class
        "void" means that this method does not have a return value
        NOTE: static blok içerisinde çağırdığımız metodun da static olması gerekir
    */

    private static void myMethod() {
        System.out.println("First method");
    }

    public static void myMethodTwo() {
        System.out.println("Second method");
    }

    static void myMethodThree() {
        System.out.println("Third method");
    }

    static int myMethodFour(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        myMethod();
        myMethodTwo();
        myMethodTwo();
        myMethodThree();
        System.out.println(myMethodFour(10, 15));
    }
}
