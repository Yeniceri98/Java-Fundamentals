package sections.sec99_algorithms_livecoding_practice.algorithms.SearchAlgorithms_FindMinMax;

import java.util.Arrays;
import java.util.List;

public class FindSmallestNumberAndIndex {
    public static void main(String[] args) {
        System.out.println(findSmallestNumber(Arrays.asList(5, 8, 4, 2, 12)));
        System.out.println(findIndexOfSmallestNumber(new int[]{5, 8, 4, 2, 12}));
    }

    public static int findSmallestNumber(List<Integer> list) {
        if (list.isEmpty()) return 0;

        int smallest = list.getFirst();

        for (int num : list) {
            if (num < smallest) {
                smallest = num;
            }
        }

        return smallest;
    }

    public static int findIndexOfSmallestNumber(int[] array) {
        if (array.length == 0) return 0;

        int smallest = array[0];
        int smallestIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                smallestIndex = i;
            }
        }

        return smallestIndex;
    }
}
