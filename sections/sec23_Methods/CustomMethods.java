package sections.sec23_Methods;

import java.util.Scanner;

public class CustomMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        greet();

        System.out.println("How many times you want to execute name method?");
        int userInput = scanner.nextInt();

        for (int i=0; i<userInput; i++) {
            name();
        }
    }

    public static void greet() {
        System.out.println("Method created");
    }

    public static void name() {
        System.out.println("Ahmet");
    }
}
