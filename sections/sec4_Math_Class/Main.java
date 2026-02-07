package sections.sec4_Math_Class;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(Math.abs(-10));          // Output: 10
        System.out.println(Math.max(3.6, 15));      // Output: 15.0
        System.out.println(Math.sqrt(81));          // Output 9.0
        System.out.println(Math.pow(5, 2));         // Output 25.0
        System.out.println((int)Math.pow(5, 2));    // Output 25  --->  NOTE: (int) yazarak "casting" işlemini yapıyoruz ve integer'a dönüşüyor
        System.out.println(Math.PI);                // Output: 3.141592653589793
        System.out.println((int)Math.PI);           // Output: 3


        // Hypotenus Example
        double x, y, z;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter X: ");
        x = scanner.nextDouble();
        System.out.print("Enter Y: ");
        y = scanner.nextDouble();

        z = Math.sqrt((x * x) + (y * y));
        System.out.println("Hypotenus is: " + z);

        scanner.close();        // Kapatmak zorunda değiliz
    }
}
