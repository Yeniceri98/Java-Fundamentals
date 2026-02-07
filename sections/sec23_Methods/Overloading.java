package sections.sec23_Methods;

public class Overloading {
    /*
        With method overloading, multiple methods can have the same name with different parameters:
        int myMethod(int x)
        float myMethod(float x)
        double myMethod(double x, double y)
    */

    public static void main(String[] args) {
        // Without Overloading
        int myNum1 = plusMethodInt(8, 5);
        double myNum2 = plusMethodDouble(10.4, 20.2);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);


        // With Overloading
        // Example 1
        int number = minusMethod(5, 3);
        double number2 = minusMethod(12.40, 3.50);
        System.out.println("int: " + number);
        System.out.println("double: " + number2);


        // Example 2:
        System.out.println("Result: " + multiply(1,2));
        System.out.println("Result: " + multiply(1,2,3));
        System.out.println("Result: " + multiply(1,2,3,4));
    }

    // Without Overloading
    static int plusMethodInt(int x, int y) {
        return x + y;
    }

    static double plusMethodDouble(double x, double y) {
        return x + y;
    }


    // With Overloading
    static int minusMethod(int x, int y) {
        return x - y;
    }

    static double minusMethod(double x, double y) {
        return x - y;
    }


    // NOTE: Aynı data type kullanıp farklı sayıda parametre atayarak da yapabiliriz:
    static int multiply(int a, int b) {
        System.out.println("1st method used: ");
        return a * b;
    }

    static int multiply(int a, int b, int c) {
        System.out.println("2nd method used: ");
        return a * b * c;
    }

    static int multiply(int a, int b, int c, int d) {
        System.out.println("3rd method used: ");
        return a * b * c * d;
    }
}
