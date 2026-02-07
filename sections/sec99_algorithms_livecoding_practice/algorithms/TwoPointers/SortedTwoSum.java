package sections.sec99_algorithms_livecoding_practice.algorithms.TwoPointers;

import java.util.Arrays;

public class SortedTwoSum {
    public static void main(String[] args) {
        int[] array = {4, 1, 8, 7, 6};
        Arrays.sort(array);  // It must be sorted
        System.out.println(twoSum(array, 15));  // Returns true since 7 + 8 = 15
    }

    private static boolean twoSum(int[] array, int targetValue) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            int sum = array[left] + array[right];

            if (sum == targetValue) {
                return true;
            } else if (sum < targetValue) {
                left++;
            } else {
                right--;
            }
        }

        return false;
    }
}
