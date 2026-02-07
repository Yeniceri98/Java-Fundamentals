package sections.sec25_Wrapper_Classes;

public class Main {
    public static void main(String[] args) {
        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 15.2;
        String e = "Ahmet";

        if (b == '@') {
            System.out.println("correct");
        }

        // Autoboxing: primitive -> wrapper
        int number = 42;
        Integer wrappedNumber = number; // automatically boxes int to Integer

        double decimal = 3.14;
        Double wrappedDecimal = decimal; // automatically boxes double to Double

        // Unboxing: wrapper -> primitive
        Integer boxedValue = 100;
        int primitiveValue = boxedValue; // automatically unboxes Integer to int

        // Autoboxing in method calls
        printNumber(55); // automatically boxes int to Integer

        // Unboxing in arithmetic operations
        Integer num1 = 10;
        Integer num2 = 20;
        int sum = num1 + num2; // automatically unboxes both numbers for addition
    }

    public static void printNumber(Integer num) {
        System.out.println("Number is: " + num);
    }
}

/*
    Wrapper class provides a way to use primitive data types as reference data types
    Reference data types contain useful methods
    It can be used with collections (like ArrayList)

    PRIMITIVE       WRAPPER
    boolean         Boolean
    char            Character
    int             Integer
    double          Double

    autoboxing: The automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper class
    unboxing: The reverse of autoboxing. Automatic conversion of wrapper class to primitive types
*/
