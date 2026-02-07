package sections.sec23_Methods;

import java.util.Arrays;

public class Parameters {
    public static void main(String[] args) {
        myMethod("Ahmet");
        myMethod("Alperen");
        myMethod("Hüseyin");

        myMethodTwo("Alex", 38);
        myMethodTwo("Altay", 23);

        System.out.println(myMethodThree(10));
        System.out.println(myMethodFour(15.65, 6.32));

        int z = myMethodFive(5, 10);
        System.out.println(z);

        checkAge(20);

        char[] letters = {'A', 'A', 'A', 'B', 'C', 'D', 'D', 'E', 'E', 'E'};
        int count = countOccurences(letters, 'A');
        System.out.println(count);
    }


    // The following example has a method that takes a "String" called "fname" as parameter. When the method is called, we pass along a first name, which is used inside the method to print the full name:
    static void myMethod(String fname) {
        System.out.println("Name: " + fname);
    }


    // You can have as many parameters as you like:
    static void myMethodTwo(String name, int age) {
        System.out.println("Name: " + name + " Age: " + age);
    }


    // Return Values
    // If you want the method to return a value, you can use a primitive data type (such as int, char, etc.) instead of void, and use the return keyword inside the method:
    static int myMethodThree(int x) {
        return 5 + x;
    }


    // This example returns the sum of a method's two parameters:
    static double myMethodFour(double x, double y) {
        return x - y;
    }


    // You can also store the result in a variable (recommended, as it is easier to read and maintain):
    static int myMethodFive(int x, int y) {
        return x * y;
    }


    // Using If - Else in Method
    static void checkAge(int age) {
        if (age > 18) {
            System.out.println("You're an adult");
        } else if (age >= 16 && age < 18) {
            System.out.println("You're almost an adult");
        } else {
            System.out.println("You're not an adult!!!");
        }
    }


    // Another method example
    public static int countOccurences(char[] letters, char searchLetter) {
        System.out.println(Arrays.toString(letters));
        System.out.println(searchLetter);

        int count = 0;

        for (char letter : letters) {
            if (letter == searchLetter) {
                count++;
            }
        }

        return count;
    }
}
