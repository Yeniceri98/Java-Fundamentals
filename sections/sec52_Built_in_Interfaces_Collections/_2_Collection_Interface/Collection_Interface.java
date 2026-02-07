package sections.sec52_Built_in_Interfaces_Collections._2_Collection_Interface;

import java.util.*;

public class Collection_Interface {
    public static void main(String[] args) {
        // The Collection interface describes functionality related to collections.
        // Among other things, "lists" and "sets" are categorized as "collections" in Java — both the List and Set interfaces implement the Collection interface.
        // The Collection interface provides, for instance, methods for checking the existence of an item (the method contains) and determining the size of a collection (the method size).
        // The Collection interface also determines how the collection is iterated over.
        // Any class that implements the Collection interface, either directly or indirectly, inherits the functionality required for a for-each loop.

        // Let's create a hash table and iterate over its keys and values.
        Map<String, String> translations = new HashMap<>();
        translations.put("Merhaba", "Hello");
        translations.put("Evet", "Yes");
        translations.put("Hayır", "No");

        System.out.println("Keys: ");
        Collection<String> keys = translations.keySet();

        for (String key : keys) {
            System.out.println(key);
        }

        System.out.println();
        System.out.println("Values: ");
        Collection<String> values = translations.values();

        for (String value : values) {
            System.out.println(value);
        }

    }
}
