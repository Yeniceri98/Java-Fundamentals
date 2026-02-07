package sections.sec9_User_Input;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // The "Scanner" class is used to get user input, and it is found in the java.util package

        Scanner myObj = new Scanner(System.in);             // Creating a Scanner object
        System.out.println("Enter name");
        String userName = myObj.nextLine();                 // Reading user input for Strings
        System.out.println("Username is: " + userName);

        Scanner num = new Scanner(System.in);
        System.out.print("Enter a number: ");               // "println" yerine "print" yazılırsa alt satıra inmez
        int number = num.nextInt();                         // Reading user input for integers
        System.out.println("Number is: " + number);


        // NOTE: Tek bir Scanner oluşturmak yeterlidir. Her bir variable için ayrı ayrı oluşturmaya gerek yoktur
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter integer value: ");
        int value = sc.nextInt();
        System.out.println(value);

        System.out.print("Enter city: ");
        String city = sc.nextLine();
        System.out.println(city);

        System.out.print("Enter float number: ");
        float floatNumber = sc.nextFloat();
        System.out.println(floatNumber);

        System.out.print("Enter byte value: ");
        float byteValue = sc.nextByte();
        System.out.println(byteValue);

        System.out.println("Enter short value: ");
        short shortDataType = sc.nextShort();
        System.out.println(shortDataType);



        // Farklı Yöntemle User Input Alma
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter int");
        int myNumber = scn.nextInt();                         // 1. Yöntem
        int myNumber2 = Integer.valueOf(scn.nextInt());       // 2. Yöntem
        System.out.println(myNumber);
        System.out.println(myNumber2);
    }
}


/*
    nextBoolean()	Reads a boolean value from the user
    nextByte()	    Reads a byte value from the user
    nextDouble()	Reads a double value from the user
    nextFloat()	    Reads a float value from the user
    nextInt()	    Reads a int value from the user
    nextLine()	    Reads a String value from the user
    nextLong()	    Reads a long value from the user
    nextShort()	    Reads a short value from the user
*/
