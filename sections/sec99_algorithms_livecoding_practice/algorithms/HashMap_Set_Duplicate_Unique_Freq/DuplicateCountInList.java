package sections.sec99_algorithms_livecoding_practice.algorithms.HashMap_Set_Duplicate_Unique_Freq;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicateCountInList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C", "A", "A", "D", "B");
        System.out.println(countDuplicates(list));
    }

    private static Map<String, Integer> countDuplicates(List<String> list) {
        Map<String, Integer> freqMap = new HashMap<>();

        for (String letter : list) {
            int currentCount = freqMap.getOrDefault(letter, 0);
            freqMap.put(letter, currentCount + 1);  // Final map will become: {A=3, B=2, C=1, D=1}
        }

        for (Map.Entry<String, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Duplicate Item: " + entry.getKey());
            } else {
                System.out.println("Unique Item: " + entry.getKey());
            }
        }

        return freqMap;
    }
}