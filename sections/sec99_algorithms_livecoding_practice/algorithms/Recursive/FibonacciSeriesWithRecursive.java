package sections.sec99_algorithms_livecoding_practice.algorithms.Recursive;

public class FibonacciSeriesWithRecursive {
    public static void main(String[] args) {
        printFibonacci(10);
    }

    public static int printFibonacci(int n) {
        if (n < 0) throw new IllegalArgumentException("n must be greater than 0");
        if (n == 0) return 0;
        if (n == 1) return 1;

        return printFibonacci(n - 1) + printFibonacci(n - 2);
    }
}

// 0 1 1 2 3 5 8 13 21
