package sections.sec99_algorithms_livecoding_practice.algorithms.Swap;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        swap(arr, 0, 1);
        System.out.println(Arrays.toString(arr));   // [2, 1, 4, 5]
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
