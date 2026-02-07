package sections.sec52_Built_in_Interfaces_Collections._2_Collection_Interface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Demo {
    public static void show() {
        Collection<String> collection = new ArrayList<>();

        collection.add("A");
        collection.add("B");
        for (var item : collection)
            System.out.println(item);       // A, B

        // add metodu yerine aşağıdaki kullanım da mevcuttur:
        Collections.addAll(collection, "c", "d", "e");
        System.out.println(collection);     // [c, d, e]

        // size
        System.out.println(collection.size());

        // remove
        collection.remove("e");             // NOTE: Collectionlarda index yoktur. Yani index 1-2-3'ü silemeyiz. Bu şekilde elemanı silebilir
        System.out.println(collection);     // [A, B, c, d]

        // contains
        var containsA = collection.contains("A");
        System.out.println(containsA);      // true

        // equals
        Collection<String> other = new ArrayList<>();
        other.addAll(collection);

        System.out.println(collection == other);        // false döndürür çünkü memoride 2 farklı objedir
        System.out.println(collection.equals(other));   // true döndürür çünkü içerikleri aynıdır. Karşılaştırma yaparken "equals" kullanmak gerekir
    }
}
