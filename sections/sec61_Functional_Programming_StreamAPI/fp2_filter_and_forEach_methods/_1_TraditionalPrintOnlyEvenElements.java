package sections.sec61_Functional_Programming_StreamAPI.fp2_filter_and_forEach_methods;

import java.util.List;

public class _1_TraditionalPrintOnlyEvenElements {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(5, 8, 10, 20, 30, 55);
        printOnlyEvenElements(numbers);
    }

    private static void printOnlyEvenElements(List<Integer> numbers) {
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }
}
