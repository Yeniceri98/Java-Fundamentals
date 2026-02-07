package sections.sec53_Generics.gc4_wildcard;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(3);
        printList(intList);

        List<String> stringList = new ArrayList<>();
        stringList.add("asdf");
        printList(stringList);

    }

    // Wildcard
    // Data type'ın ne olduğunu bilmediğimiz durumlarda kullanılır  --->  List<?>
    private static void printList(List<?> myList) {
        System.out.println(myList);
    }

}



