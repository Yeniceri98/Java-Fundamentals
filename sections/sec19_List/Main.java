package sections.sec19_List;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Defining the Type of Values That a List Can Contain
        // When defining the type of values that a list can include, the first letter of the element type has to be capitalized
        ArrayList<String> list = new ArrayList<>();     // Creating an ArrayList
        list.add("Apple");
        list.add("Banana");
        list.add("Lemon");
        System.out.println(list);                       // [Apple, Banana, Lemon]
        System.out.println(list.get(0));                // Apple
        System.out.println(list.size());                // 3
        System.out.println(list.contains("Apple"));     // true
        System.out.println(list.contains("apple"));     // false (NOTE: It should be the exact value)
        list.remove(0);                                 // Removing item with index number
        list.remove("Banana");                          // Removing item with name
        System.out.println(list);                       // [Lemon]

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(15);

        ArrayList<Boolean> list3 = new ArrayList<>();
        list3.add(true);


        /*
            Once a list has been created, ArrayList assumes that all the variables contained in it are reference types
            Java automatically converts an "int" variable into "Integer" when one is added to a list, and the same occurs when a variable is retrieved from a list
            The same conversion occurs for double-type variables, which are converted to Double
            This means that even though a list is defined to contain Integer-type variables, variables of type int can also be added to it
        */

        ArrayList<Integer> integers = new ArrayList<>();
        int a = 1;
        integers.add(a);

        ArrayList<Double> doubles = new ArrayList<>();
        double b = 3.5;
        doubles.add(b);


        // Adding to a List and Retrieving a Value from a Specific Place
        /*
            Addition is done with the list method "add", which takes the value to be added as a parameter
            We then print the value at position zero
            To retrieve a value from a certain position, you use the list method "get", which is given the place of retrieval as a parameter
        */

        // Example 1:
        ArrayList<Float> floatNums = new ArrayList<>();
        floatNums.add(14.5F);
        floatNums.add(12.3F);
        floatNums.add(5.55F);
        System.out.println(floatNums.get(0));
        System.out.println(floatNums.get(1));
        System.out.println(floatNums.get(2));

        // Example 2:
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(5);
        numbers.add(10);
        int sum = numbers.get(2) + numbers.get(3);
        System.out.println("Sum of last two numbers: " + sum);


        // Retrieving Information from a "Non-Existent" Place ___
        // If you try to retrieve information from a place that does not exist on the list, the program will print a IndexOutOfBoundsException error
        /*
            ArrayList<String> cities = new ArrayList<>();
            cities.add("İstanbul");
            cities.add("Ankara");
            System.out.println(cities.get(3));
        */


        // Size of the List
        // The number of values on a list is provided by the list's "size" method which returns the number of elements the list contains.
        // The number is an integer (int), and it can be used as a part of an expression or stored in an integer variable for later use
        ArrayList<Integer> nums = new ArrayList<>();
        System.out.println("Number of the values in the list: " + nums.size());       // Output: 0

        nums.add(10);
        System.out.println("Number of the values in the list: " + nums.size());       // Output: 1

        nums.add(15);
        nums.add(20);
        nums.add(25);
        System.out.println("Number of the values in the liat: " + nums.size());       // Output: 4


        // Iterating Over a List

        // Example 1:
        ArrayList<String> names = new ArrayList<>();
        names.add("Ahmet");
        names.add("Sami");
        names.add("Yeniçeri");

        int index = 0;

        System.out.println("Using while loop:");
        while (index < names.size()) {
            System.out.println(names.get(index));
            index++;
        }

        System.out.println("Using for loop:");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        System.out.println("Using for each loop");
        for (String name : names) {
            System.out.println(name);
        }


        // Example 2:
        ArrayList<Integer> myNumbers = new ArrayList<>();
        myNumbers.add(20);
        myNumbers.add(25);
        myNumbers.add(30);

        int counter = 0;

        while (counter < myNumbers.size()) {
            int number = myNumbers.get(counter);
            System.out.println("Index " + counter + " is " + number);
            counter ++;
        }


        // Example 3:
        ArrayList<Integer> reversingNumbers = new ArrayList<>();
        reversingNumbers.add(1);
        reversingNumbers.add(2);
        reversingNumbers.add(3);

        int k = reversingNumbers.size() - 1;
        while (k >= 0) {
            int num = reversingNumbers.get(k);
            System.out.println(num);
            k--;
        }


        // Example 4:
        ArrayList<String> footballer = new ArrayList<>();
        footballer.add("Altay");
        footballer.add("Szalai");
        footballer.add("Gustavo");

        for (int i = 0; i < footballer.size(); i++) {
            // System.out.println(footballer.get(i));
            String players = footballer.get(i);
            System.out.println(players);
        }

        String lastFootballer = footballer.get(footballer.size() - 1);
        System.out.println("Last footballer is " + lastFootballer);


        // Exercise: Kullanıcı -1 girene kadar sayılar alınacak ve sonrasında -1 haricinde listenin tuttuğu sayılar yazdırılacak
        ArrayList<Integer> myNums = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        while (true) {
            int input = scanner.nextInt();

            if (input == -1)
                break;
            myNums.add(input);
        }

        for (int i = 0; i < myNums.size(); i++) {
            System.out.println(myNums.get(i));
        }


        // Iterating Over a List with a For-Each Loop
        ArrayList<String> teachers = new ArrayList<>();
        teachers.add("John");
        teachers.add("Calum");
        teachers.add("Steve");

        for (String teacher : teachers) {
            System.out.println(teacher);
        }


        // Exercise 1: Sum of a list using for-each
        ArrayList<Integer> myInts = new ArrayList<>();
        Scanner scn = new Scanner(System.in);
        int summing = 0;

        while (true) {
            System.out.print("Enter number: ");
            int m = scn.nextInt();

            if (m == -1)
                break;
            myInts.add(m);
        }

        for (Integer myInt : myInts) {
            summing += myInt;
        }

        System.out.println(summing);


        // Removing from a List and Checking the Existence of a Value
        // The list's "remove" method removes the value that is located at the index that's given as the parameter. The parameter is an integer
        ArrayList<String> colors = new ArrayList();
        colors.add("Orange");
        colors.add("Apple");
        colors.add("Pearl");

        colors.remove(1);       // Deletes the index 1 (Apple)

        System.out.println("Index 0: " + colors.get(0));
        System.out.println("Index 1: " + colors.get(1));        // Output: Pearl


        // If the parameter given to remove is the same type as the values in the list, but not an integer, (integers are used to remove from a given index), it can be used to remove a value directly from the list
        ArrayList<String> myList = new ArrayList<>();
        myList.add("First");
        myList.add("Second");
        myList.add("Third");

        myList.remove("First");

        System.out.println("Index 0 is " + myList.get(0));        // Output: Second


        // If the list contains integers, you cannot remove a number value by giving an int type parameter to the remove method
        // This would remove the number from the index that the parameter indicates, instead of an element on the list that has the same value as the parameter
        // To remove an integer type value you can convert the parameter to Integer type; this is achieved by the "valueOf()" method of the Integer class
        ArrayList<Integer> listTwo = new ArrayList<>();
        listTwo.add(5);
        listTwo.add(10);
        listTwo.add(20);
        listTwo.add(30);

        listTwo.remove(0);                          // İlk indexi siler
        listTwo.remove(Integer.valueOf(20));        // 2. indexte bulunan 20'yi siler. Stringlerde olduğu gibi direkt 20 sayısını silemeyiz. Bu şekilde convert etmeliyiz

        System.out.println(listTwo.get(0));         // Output: 10
        System.out.println(listTwo.get(1));         // Output: 30


        // The list method "contains" can be used to check the existence of a value in the list
        // The method receives the value to be searched as its parameter, and it returns a boolean type value (true or false) that indicates whether or not that value is stored in the list.
        ArrayList<String> countries = new ArrayList<>();
        countries.add("Turkey");
        countries.add("England");
        countries.add("Germany");

        System.out.println("Is Turkey contains in the list? " + countries.contains("Turkey"));

        if (countries.contains("Spain")) {
            System.out.println("Spain is in the list");
        } else {
            System.out.println("Spain is not in the list");
        }


        // List as a Method Parameter
        ArrayList<Character> myListTwo = new ArrayList<>();
        myListTwo.add('A');
        myListTwo.add('B');
        myListTwo.add('C');

        printMethod(myListTwo);

        // It's also possible to define multiple variables for a method.
        // In the example the method receives two parameters: a list of numbers and a threshold value. It then prints all the numbers in the list that are smaller than the second parameter.
        ArrayList<Integer> myListThree = new ArrayList<>();
        myListThree.add(1);
        myListThree.add(2);
        myListThree.add(3);
        myListThree.add(5);
        myListThree.add(5);
        myListThree.add(7);

        printSmallerThan(myListThree, 5);
    }


    // List as a Method Parameter 1
    private static void printMethod(ArrayList<Character> chars) {
        for (char value : chars) {
            System.out.println(value);
        }
    }


    // List as a Method Parameter 2
    private static void printSmallerThan(ArrayList<Integer> numbers, int threshold) {
        for (int number : numbers) {
            if (number < threshold) {
                System.out.println(number);
            }
        }
    }


    // As before, a method can also return a value.
    // The methods that return values have the type of the return value in place of the void keyword, and the actual returning of the value is done by the return command.
    public static int size(ArrayList<String> list) {
        return list.size();
    }
}
