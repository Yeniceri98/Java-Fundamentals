package sections.sec22_Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSet_LinkedHashSet_TreeSet {
    public static void main(String[] args) {
        Set<Integer> numbers1 = new TreeSet<>();
        numbers1.add(5);
        numbers1.add(1);
        numbers1.add(3);
        numbers1.add(2);
        numbers1.add(4);

        Set<Integer> numbers2 = new HashSet<>();
        numbers2.add(5);
        numbers2.add(1);
        numbers2.add(3);
        numbers2.add(2);
        numbers2.add(4);

        Set<Integer> numbers3 = new LinkedHashSet<>();
        numbers3.add(5);
        numbers3.add(1);
        numbers3.add(3);
        numbers3.add(2);
        numbers3.add(4);

        System.out.println(numbers1);   // TreeSet: Sorted basar  --->  [1,2,3,4,5]
        System.out.println(numbers2);   // HashSet: Insertion order yoktur. Hangi sırayla basacağını bilemeyiz
        System.out.println(numbers3);   // LinkedHashSet: Insertion order vardır ve hangi sırayla gelirse öyle basar  --->  [5,1,3,2,4]
    }
}
