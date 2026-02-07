package sections.sec61_Functional_Programming_StreamAPI.fp1_traditional_vs_functional_approach;

import java.util.List;

public class _2_FunctionalPrintListElements {

    public static void main(String[] args) {
        printNumbersInList(List.of(5, 8, 10, 20, 30, 50));
    }

    private static void printElement(int number) {
        System.out.println(number);
    }

    private static void printNumbersInList(List<Integer> numbers) {
        /*
            We convert list to stream and print them one by one
            [5, 8, 10, 20, 30, 50]
            5
            8
            10
            20
            30
            50

            Stream is sequence of elements
        */

        numbers.stream()    // Convert to Stream
                .forEach((_2_FunctionalPrintListElements::printElement));   // Printing each elements

        /*
            (FunctionalPrintListElements::printElement)  --->  Method Reference
            Her bir element için (forEach) "printElement" metodunun çalışmasını sağladık
        */

        // Metod kullanmadan da Method Reference yapabiliriz (easier approach):
        numbers.stream().forEach(System.out::println);

    }
}
