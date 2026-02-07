package sections.sec52_Built_in_Interfaces_Collections._4_Map_Interface;

import java.util.HashMap;
import java.util.Map;

public class Map_Interface {
    public static void main(String[] args) {
        // The Map interface defines the basic behavior associated with hash tables.
        // Because the HashMap class implements the Map interface, it can also be accessed through the Map interface.
        // The keys to the hash table are obtained using the "keySet" method.
        Map<String, String> maps = new HashMap<>();
        maps.put("Ahmet", "Turkey");
        maps.put("Alessio", "Italy");

        for (String key : maps.keySet()) {
            System.out.println(key + ": " + maps.get(key));
        }


        // The "keySet" method returns a set of elements that implement the "Set" interface.
        // You can use a for-each statement to go through a set that implements the "Set" interface.
        // The hash values can be obtained from the hash table using the "values" method.
        // The "values" method returns a set of elements that implement the Collection interface.
        // Let's take a quick look at the "Set" and "Collection" interfaces:


        // Example: Map as a method parameter. Implement a class method returnSize which gets a Map-object as a parameter, and returns its size as an integer.
        Map<String, String> cities = new HashMap<>();
        cities.put("Istanbul", "Turkey");
        cities.put("Madrid", "Spain");

        System.out.println(returnSize(cities));
    }

    public static int returnSize(Map<String, String> mapOfStr) {
        return mapOfStr.size();
    }

}
