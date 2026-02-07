package sections.sec71_predicate;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        PredicateExample();
        PredicateWithStreamApi();
        PredicateComposition();
    }

    private static void PredicateExample() {
        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println(isEven.test(1));
        System.out.println(isEven.test(2));
    }

    private static void PredicateWithStreamApi() {
        List<String> names = List.of("Ahmet", "Sami", "Yeniceri", "Adnan");
        Predicate<String> startsWithA = name -> name.startsWith("A");
        List<String> filteredNames = names.stream()
                .filter(startsWithA)    // .filter(name -> startsWithA.test(name)) işe eşdeğer
                .collect(Collectors.toList());
        System.out.println(filteredNames);
    }

    private static void PredicateComposition() {
        Predicate<Integer> isEven = x -> x % 2 == 0;
        Predicate<Integer> isGreaterThanFive = x -> x > 5;
        Predicate<Integer> complexPredicate = isEven.and(isGreaterThanFive);
        System.out.println(complexPredicate.test(5));
        System.out.println(complexPredicate.test(2));
    }
}

/*
    Predicate<T> Java 8 ile gelen functional interface'lerden biridir
    Boolean bir sonuç döndüren test mantığını tanımlar ve lambda ifadeleri ile sıkça kullanılır
    Predicate'in "test" metodu verilen değerin koşulu karşılayıp karşılamadığını söyler
*/