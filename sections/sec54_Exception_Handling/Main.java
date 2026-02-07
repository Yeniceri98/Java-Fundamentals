package sections.sec54_Exception_Handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter a whole number to divide");
            int x = scanner.nextInt();

            System.out.println("Enter a whole number to divide by");
            int y = scanner.nextInt();

            int z = x / y;

            System.out.println("Result " + z);
        } catch (ArithmeticException e) {
            System.out.println("You can not divide by 0 dude!");
        } catch (InputMismatchException e) {
            System.out.println("You have to input number not string!");
        } catch (Exception e) {
            System.out.println("This can catch all errors but not the best practice");
        } finally {
            System.out.println("This will always print");
            scanner.close();
        }

        /*
            try-catch bloğuna almadığımızda bir sayıyı 0'a bölünce "ArithmeticException" hatası veriyordu
            int yerine string değer girdiğimizde de "InputMismatchException" hatası verir
            "Exception" her türlü hata için kullanılabilir ama spesifik olmadığı için çok önerilmez
            finally bloğu hata olsa da olmasa da en son çalışır
        */

    }
}
