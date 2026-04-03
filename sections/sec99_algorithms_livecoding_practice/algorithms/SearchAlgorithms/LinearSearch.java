package sections.sec99_algorithms_livecoding_practice.algorithms.SearchAlgorithms;

/*
    Linear search is a search algorithm that searches for information in an array by going through every value in the array one by one
    Runtime Complexity: O(n)
*/
public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {1, 3, 7, 15, 43, 12};
        int targetNumber = 15;
        int targetIndex = linearSearch(array, targetNumber);
        System.out.println("Target number " + targetNumber + " found at index " + targetIndex);       // Returns 3
    }

    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }
}