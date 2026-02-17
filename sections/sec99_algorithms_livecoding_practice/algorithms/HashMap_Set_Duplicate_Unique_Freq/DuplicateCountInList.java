package sections.sec99_algorithms_livecoding_practice.algorithms.HashMap_Set_Duplicate_Unique_Freq;

import java.util.*;

public class DuplicateCountInList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C", "A", "A", "D");
        System.out.println(countDuplicates(list));
    }

    private static Map<String, Integer> countDuplicates(List<String> list) {
        Map<String, Integer> listMap = new HashMap<>();

        for (String item : list)  {
            int currentCount = listMap.getOrDefault(item, 0);
            listMap.put(item, currentCount + 1);

            if (currentCount > 0) {
                System.out.println("Duplicate item: " + item);
            } else {
                System.out.println("Unique item: " + item);
            }
        }

        return listMap;
    }
}