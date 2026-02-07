package sections.sec60_Recursion;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println("Enter index to see it's fibonacci value: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(fibonacci(n));
    }

    private static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return (fibonacci(n - 1) + fibonacci(n - 2));
    }
}

/*
    0 1 1 2 3 5 8 13 21 34 55 ...
    f(n) = f(n - 1) + f(n - 2)
*/