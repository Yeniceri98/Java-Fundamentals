package sections.sec18a_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // To declare an array, define the variable type with square brackets:
        String[] cars;

        // To insert values to it, we can use an array literal - place the values in a comma-separated list, inside curly braces:
        String[] car = {"Volvo", "BMW", "Ford"};
        int[] numbers = {1, 2, 3, 4, 5};

        // Creating Array Using "new" Keyword
        int[] num = new int[4];
        System.out.println(Arrays.toString(num));       // [0, 0, 0, 0]
        num[0] = 0;
        num[1] = 1;
        num[2] = 2;
        num[3] = 3;
        System.out.println(Arrays.toString((num)));     // [0, 1, 2, 3]

        // Accessing Array Elements
        String[] cities = {"London", "Berlin", "Istanbul"};
        System.out.println(cities[2]);  // Istanbul

        // Accessing the Last Element
        int[] odds = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21};
        System.out.println(odds[odds.length - 1]);

        // Changing Array Element
        String[] names = {"Ahmet", "Sami", "Yeniçeri"};
        names[2] = "Janissary";
        System.out.println(names);                      // [Ljava.lang.String;@1cd072a9   --->  Array'in memory lokasyonunu bastırır. İçeriği için toString() kullanmak gerekir
        System.out.println(Arrays.toString(names));     // [Ahmet, Sami, Janissary]
        System.out.println(names[2]);                   // Janissary

        // Exercise 1: Indice Swap
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[5];
        array[0] = 1;
        array[1] = 3;
        array[2] = 5;
        array[3] = 7;
        array[4] = 9;

        int index = 0;
        System.out.println("Array elements: ");

        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }

        System.out.println("\nGive 2 indices to swap: ");
        int firstIndex = Integer.valueOf(scanner.nextLine());       // User Input First Way
        int secondIndex = scanner.nextInt();                        // User Input Second Way

        int helper = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = helper;

        index = 0;
        System.out.println("\nNew sort: ");

        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }

        // Size of an Array and Iterating
        int[] myArray = {1, 2, 3, 10, 20, 30};

        System.out.println("Array has " + myArray.length + " elements");

        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }

        // Array as a Parameter of a Method
        // As noticed earlier, you can freely choose the name of the parameter inside the method, the name doesn't have to be the same as the name of the variable when you call the method.
        // In the example below, we call the array "integerArray", meanwhile the caller of the method has named the same array "numbers"
        int[] myNumbers = new int[3];
        myNumbers[0] = 10;
        myNumbers[1] = 20;
        myNumbers[2] = 30;

        listElements(myNumbers);

        // Exercise 1: Sum of Array Using Method
        Scanner scn = new Scanner(System.in);
        int[] myNumbersTwo = new int[5];

        System.out.println("\nEnter the numbers:");
        for (int i = 0; i < myNumbers.length; i++) {
            myNumbersTwo[i] = scn.nextInt();
        }

        System.out.println("\nArray elements: ");
        for (int i = 0; i < myNumbersTwo.length; i++) {
            System.out.println(myNumbersTwo[i]);
        }

        sumOfArrayElements(myNumbersTwo);

        // Exercise 2: Print the Array Elements In One Line
        int[] myArrayTwo = {1, 2, 3, 4, 5};
        printArrayElements(myArrayTwo);

        // Exercise 3: Print in Stars
        int[] myArrayThree = {5, 1, 3, 2, 4};
        printInStars(myArrayThree);

        // Exervice 4:
        int[] mainArray = new int[]{-10, 20, 30, -40, -50, 60, 70, -80, -90};
        int[] array1 = new int[3];
        int[] array2 = new int[3];
        int[] array3 = new int[3];

        // NOTE: for döngüsünde 2 farklı değişken kullanılabilir fakat ikisinin datatype'ı aynı olmalıdır
        for (int i = 0, j = 0; i < mainArray.length; i+=3, j++) {
            array1[j] = mainArray[i];
            array2[j] = mainArray[i + 1];
            array3[j] = mainArray[i + 2];
        }

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));
}

    public static void listElements(int[] integerArray) {
        System.out.println("The elements of the arrays are: ");
        int index = 0;

        while (index < integerArray.length) {
            int number = integerArray[index];
            System.out.println(number + "");
            index++;
        }
    }

    // Exercise 1:
    public static void sumOfArrayElements(int[] arrayElements) {
        System.out.println("\nSum of the elements in the array: ");
        int index = 0;
        int sum = 0;

        while (index < arrayElements.length) {
            sum += arrayElements[index];
            index++;
        }

        System.out.println(sum);
    }

    // Exercise 2:
    public static void printArrayElements(int[] printingElements) {
        for (int i = 0; i < printingElements.length; i++) {
            System.out.print(printingElements[i] + " ");
        }
    }

    // Exercise 3:
    public static void printInStars(int[] printingAsStars) {
        for (int e : printingAsStars) {
            for (int i = 0; i < e; i++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}


