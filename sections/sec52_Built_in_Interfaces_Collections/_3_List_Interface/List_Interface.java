package sections.sec52_Built_in_Interfaces_Collections._3_List_Interface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List_Interface {
    public static void main(String[] args) {
        // The List interface defines the basic functionality related to lists.
        // Because the ArrayList class implements the "List" interface, one can also use it through the "List" interface.
        List<String> strings = new ArrayList<>();
        strings.add("String objects inside an arraylist object");


        // As we can see fom the Java API of List, there are many classes that implement the `List` interface.
        // One list that is familiar to computer scientists is a linked list.
        // A linked list can be used through the List interface exactly the same way as an object created from ArrayList.
        List<String> myList = new LinkedList<>();
        myList.add("String objects inside a linkedlist object");


        // From the perspective of the user, both implementations of the List interface work the same way.
        // The interface abstracts their inner functionality.
        // The internal structures of ArrayList and LinkedList differ quite a bit.
        // ArrayList saves objects to an array where fetching an object with a specific index is very fast.
        // On the other hand LinkedList constructs a list where each element contains a reference to the next element in the list.
        // When one searches for an object by index in a linked list, one has to go though the list from the beginning until the index.


        // Example: List as method parameter. Implement a class method "returnSize", which is given a List-object as a parameter, and returns the size of the list as an integer.
        List<String> names = new ArrayList<>();
        names.add("Ahmet");
        names.add("Katie");
        names.add("Tom");

        System.out.println(returnSize(names));
    }

    public static int returnSize(List<String> aList) {
        return aList.size();
    }
}
