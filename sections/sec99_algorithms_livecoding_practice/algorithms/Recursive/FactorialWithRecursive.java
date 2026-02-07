package sections.sec99_algorithms_livecoding_practice.algorithms.Recursive;

public class FactorialWithRecursive {
    public static void main(String[] args) {
        System.out.println(printFactorial(5));
    }

    private static int printFactorial(int num) {
        if (num < 0) throw new IllegalArgumentException("num must be greater than 0");
        if (num == 0 || num == 1) return 1;

        return num * printFactorial(num - 1);
    }
}

// 5 * 4 * 3 * 2 * 1