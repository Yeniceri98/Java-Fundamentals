package sections.sec99_algorithms_livecoding_practice.algorithms.Math_NumberTheory;

// Perfect Number: Kendisi hariç pozitif bölenlerinin toplamı kendisine eşit olan sayı. Örn: 6 → 1 + 2 + 3 = 6
public class PerfectNumber {
    public static void main(String[] args) {
        // First few perfect numbers: 6, 28, 496, 8128
        int[] testNumbers = {6, 28, 496, 8128, 10, 15, 100};

        for (int num : testNumbers) {
            System.out.println("Is " + num + " perfect number? " + isPerfectNumber(num));
        }
    }

    public static boolean isPerfectNumber(int number) {
        if (number <= 0) return false;

        int sum = 0;

        // Find all divisors and sum them
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        // Check if sum of divisors equals the original number
        return sum == number;
    }
}
