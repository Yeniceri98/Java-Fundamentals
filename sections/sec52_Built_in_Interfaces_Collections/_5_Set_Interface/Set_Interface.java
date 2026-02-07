package sections.sec52_Built_in_Interfaces_Collections._5_Set_Interface;

import java.util.HashSet;
import java.util.Set;

public class Set_Interface {
    public static void main(String[] args) {
        // The Set interface describes functionality related to sets.
        // In Java, sets always contain either 0 or 1 amounts of any given object.
        // As an example, the set interface is implemented by HashSet.
        // Here's how to go through the elements of a set:
        Set<String> set = new HashSet<>();
        set.add("one");
        set.add("two");
        set.add("three");

        for (String e : set) {
            System.out.println(e);
        }

        System.out.println(returnSize(set));
    }

    public static int returnSize(Set<String> setList) {
        return setList.size();
    }
}
