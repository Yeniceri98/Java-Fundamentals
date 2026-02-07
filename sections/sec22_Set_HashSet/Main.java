package sections.sec22_Set_HashSet;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<String> names = new HashSet<>();

        names.add("Walter");
        names.add("Jesse");
        names.add("Skyler");
        names.add("Saul");
        names.add("Walter");    // NOTE: Hata vermez fakat yazdırırken 2 kez Walter gözükmez

        names.remove("Saul");   // NOTE: Set'te bu şekilde sileriz, indexiyle silemeyiz. List'te indexle silebiliriz. Çünkü Set'te order yoktur index değeri her seferinde değişir

        System.out.println(names);
        System.out.println(names.size());
        System.out.println(names.contains("Jesse"));
        System.out.println(names.isEmpty());

        // Looping
        for (String name : names) {
            System.out.println(name);
        }

        // Looping another way
        names.forEach(System.out::println);

        // Removing All Elements
        names.clear();
        System.out.println(names.size());
    }
}

/*
    NOTE:
    "Set" interface olduğu için Set<String> names = new Set<String>() tanımlarsak metodlarını da override etmemiz gerekir
    Bu yüzden genelde "HashSet" şeklinde kullanılır

    List vs Set
    - List is ordered, Set is unordered
    - Set değerleri yazdırılırken belli bir sıraya göre yazdırılmaz. u yüzden List'te indexleme varken Set'te yoktur
    - List allows duplicate values, Set does not
*/