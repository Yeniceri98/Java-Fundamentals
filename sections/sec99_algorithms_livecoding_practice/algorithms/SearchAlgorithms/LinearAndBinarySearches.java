package sections.sec99_algorithms_livecoding_practice.algorithms.SearchAlgorithms;

import java.util.Arrays;

public class LinearAndBinarySearches {
    public static void main(String[] args) {
        // Linear Search
        int[] myArrayLinear = {1, 3, 7, 15, 43, 12};
        int targetNumLinear = 15;
        int targetIndexLinear = LinearAndBinarySearches.linearSearch(myArrayLinear, targetNumLinear);
        System.out.println("Target " + targetNumLinear + " found at index " + targetIndexLinear);       // Returns 3

        // Binary Search
        int[] myArrayBinary = {3, 5, 7, 12, 8, 54, 23, 85, 4, 74, 93};
        Arrays.sort(myArrayBinary);  // It has to be sorted array
        int targetNumBinary = 7;
        int targetIndexBinary = LinearAndBinarySearches.binarySearch(myArrayBinary, targetNumBinary);
        System.out.println("Target " + targetNumBinary + " found at index " + targetIndexBinary);
    }

    /*
        Linear search is a search algorithm that searches for information in an array by going through every value in the array one by one
        Runtime Complexity: O(n)
    */
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    /*
        Binary Search is a search algorithm that finds the position of a target value within a "sorted" array
        Half of the array is eliminated during each step
        It works well in large data sets compare to linear search
        Linear search works better in small data sets
        Runime Complexity: O(log n)
    */
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
