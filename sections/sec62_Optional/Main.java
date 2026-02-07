package sections.sec62_Optional;

import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        List<String> fruits = List.of("Apple", "Banana", "Mango", "Avocado");

        Optional<String> optional = fruits.stream().filter(fruit -> fruit.startsWith("A")).findFirst();
        System.out.println(optional);
        System.out.println(optional.isPresent());
        System.out.println(optional.isEmpty());
        System.out.println(optional.get());

        // Creating Optional
        Optional<String> city = Optional.of("Istanbul");

        Optional<String> empty = Optional.empty();
    }
}

/*
    A ile başlayan fruit olmama ihtimali olduğu için Optional eklemezsek program hata verir
    Eğer C ile aratırsak C ile başlayan fruit olmadığı için Optional.empty olarak döndürür
*/