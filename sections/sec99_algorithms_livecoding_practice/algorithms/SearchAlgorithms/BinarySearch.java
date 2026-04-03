package sections.sec99_algorithms_livecoding_practice.algorithms.SearchAlgorithms;

import java.util.Arrays;

/*
    Binary Search is a search algorithm that finds the position of a target value within a "sorted" array
    Half of the array is eliminated during each step
    It works well in large data sets compare to linear search
    Linear search works better in small data sets
    Runime Complexity: O(log n)
*/
public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {3, 5, 7, 12, 8, 54, 23, 85, 4, 74, 93};
        Arrays.sort(array);  // It has to be sorted array
        int targetNumber = 7;
        int targetIndex = binarySearch(array, targetNumber);
        System.out.println("Target number " + targetNumber + " found at index " + targetIndex);
    }

    public static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
