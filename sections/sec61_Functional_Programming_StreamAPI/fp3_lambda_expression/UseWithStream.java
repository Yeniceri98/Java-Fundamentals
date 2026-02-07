package sections.sec61_Functional_Programming_StreamAPI.fp3_lambda_expression;

import java.util.List;
import java.util.stream.Collectors;

public class UseWithStream {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(5, 8, 15, 18, 30, 55);
        printOddNumbers(numbers);
    }

    private static void printOddNumbers(List<Integer> numbers) {
        // forEach() ile tek sayıları ekrana yazdırma
        numbers.stream()
                .filter(number -> number % 2 != 0)      // Lambda Expression
                .forEach(System.out::println);          // Lambda'lı şekilde de tanımlanabilir ---> .forEach((p) -> System.out.println(p));

        // collect() ile sayıları yeni bir listeye toplama
        List<Integer> oddNumbers = numbers.stream()
                .filter(number -> number % 2 != 0)      // Lambda Expression
                .collect(Collectors.toList());
        System.out.println("Odd Numbers: " + oddNumbers);
    }
}

/*
    Lambda is simplifier implementation of method

    forEach() ve collect()
    - forEach, işlemlerin sonucunu hemen görmek (örneğin, ekrana yazdırmak) istendiğininde kullanılır
    - collect, işlemlerin sonucunu saklamak ve daha sonra kullanmak için yeni bir koleksiyon oluşturmak istendiğinde kullanılır
*/