package sections.sec61_Functional_Programming_StreamAPI.fp5_reduce_method;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<String> words = Arrays.asList("Ahmet", "Sami", "Yeniceri");

        // EX 1:
        int sumOfNumbers = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(sumOfNumbers);

        // NOTE: We can replace lambda with method reference as well
        int sumOfNumbersTwo = numbers.stream().reduce(0, Integer::sum);
        System.out.println(sumOfNumbersTwo);

        // EX 2:
        Optional<String> combineValues = words.stream().reduce((str1, str2) -> str1 + "-" + str2);
        System.out.println(combineValues);
    }
}

/*
    reduce() operation applies a binary operator to each element in the stream where the first argument to the operator is the return value of the previous application and second argument is the current stream element
*/
