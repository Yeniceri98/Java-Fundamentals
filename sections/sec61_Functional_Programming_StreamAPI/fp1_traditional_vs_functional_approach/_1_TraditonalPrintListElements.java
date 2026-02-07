package sections.sec61_Functional_Programming_StreamAPI.fp1_traditional_vs_functional_approach;

import java.util.List;

public class _1_TraditonalPrintListElements {

    public static void main(String[] args) {
        printNumbersInList(List.of(5, 8, 10, 20, 30, 50));
    }

    private static void printNumbersInList(List<Integer> numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}

/*
    List.of is introduced in Java 9
    Arrays.asList is a good alternative in java 8
*/