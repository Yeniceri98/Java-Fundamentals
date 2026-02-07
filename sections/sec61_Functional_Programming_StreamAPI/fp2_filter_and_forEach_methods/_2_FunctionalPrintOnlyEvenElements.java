package sections.sec61_Functional_Programming_StreamAPI.fp2_filter_and_forEach_methods;

import java.util.List;
import java.util.stream.Stream;

public class _2_FunctionalPrintOnlyEvenElements {
    public static void main(String[] args) {
        List<Integer> nums = List.of(5, 17, 10, 8, 30, 3);
        printOnlyEvenElements(nums);

        // We can explicitly define Stream as well:
        Stream<Integer> data = nums.stream();
        data.forEach(System.out::println);

        // NOTE: Stream'i 1 kez kullandıktan sonra bir daha kullanamayız. O yüzden alttaki kod hata verir
        // data.forEach(System.out::println);

        // Printing the number of elements (count)
        Stream<Integer> dataTwo = nums.stream();
        System.out.println("Number of elements: " + dataTwo.count());

        // Sorting data (sorted)
        Stream<Integer> sortedData = nums.stream().sorted();
        System.out.println("Sorted data:");
        sortedData.forEach(System.out::println);
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    private static void printOnlyEvenElements(List<Integer> numbers) {
        numbers.stream()
                .filter(_2_FunctionalPrintOnlyEvenElements::isEven)     // Filter Only Even
                .forEach(System.out::println);                          // Method Reference

        // NOTE: We can do the same thing without calling the "isEven" by using Lambda Expression (fp2_lambda_expression)
    }
}
