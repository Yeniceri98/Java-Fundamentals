package sections.sec99_algorithms_livecoding_practice.algorithms.Math_NumberTheory;

public class MissingNumberInArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 6};
        int n = 6;  // length of the array if it was fully correct

        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;

        for (int i : nums) {
            actualSum += i;
        }

        System.out.println(expectedSum - actualSum);
    }
}

// A = n * (n + 1) / 2
