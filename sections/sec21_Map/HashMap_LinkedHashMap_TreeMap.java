package sections.sec21_Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMap_LinkedHashMap_TreeMap {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        Map<Integer, String> treeMap = new TreeMap<>();

        int[] keys = {3, 1, 2};

        for (int k : keys) {
            hashMap.put(k, "Value-" + k);
            linkedHashMap.put(k, "Value-" + k);
            treeMap.put(k, "Value-" + k);
        }

        System.out.println("HashMap: " + hashMap);  // Yazdırma sıra belirsizdir
        System.out.println("LinkedHashMap: " + linkedHashMap);  // Eklendiği sıraya göre yazdırır  --->  {3=Value-3, 1=Value-1, 2=Value-2}
        System.out.println("TreeMap: " + treeMap);  // Sorted yazdırır  --->  {1=Value-1, 2=Value-2, 3=Value-3}
    }
}
