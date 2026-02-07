package sections.sec62_Optional;

import java.util.Optional;

public class MainTwo {

    public static void main(String[] args) {
        Optional<Cat> optionalCat = findCatByName("Furry");

        if (optionalCat.isPresent()) {
            System.out.println(optionalCat.get().getAge());
        } else {
            System.out.println(0);
        }
    }

    private static Optional<Cat> findCatByName (String name) {
        Cat cat = new Cat(name, 5);
        return Optional.ofNullable(null);    // NOTE: null olup olmadığından emin değilsek "ofNullable" kullanabiliriz. Diğer opsiyon "of"
        // return Optional.ofNullable(null);
    }
}
