package sections.sec99_algorithms_livecoding_practice.algorithms.TwoPointers;

import java.util.Arrays;

public class MoveAllZeroesToTheEndInArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 0, 4, 0, 5, 6, 0, 7, 0, 8, 9};
        System.out.println("Original Array: " + Arrays.toString(array));

        moveAllZeroesToTheEnd(array);

        System.out.println("Arranged Array: " + Arrays.toString(array));
    }

    private static void moveAllZeroesToTheEnd(int[] array) {
        int index = 0;

        // Moving all non-zero elements to front
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                array[index] = array[i];
                index++;
            }
        }

        System.out.println("Index after non-zero elements put to front: " + index);

        // Filling remaining indexes with 0
        while (index < array.length) {
            array[index] = 0;
            index++;
        }
    }
}
