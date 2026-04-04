package sections.sec99_algorithms_livecoding_practice.algorithms.HashMap_Set_Duplicate_Unique_Freq;

import java.util.*;

public class FirstRepeatingCharInString {
    public static void main(String[] args) {
        System.out.println(findFirstRepeatingCharUsingSet("abcdefab"));  // a
        System.out.println(findFirstRepeatingCharUsingMap("abcdefab"));  // a
    }

    public static Character findFirstRepeatingCharUsingSet(String input) {
        Set<Character> seen = new HashSet<>();

        for (char letter : input.toCharArray()) {
            if (seen.contains(letter)) {
                return letter;
            } else {
                seen.add(letter);
            }
        }

        return null;    // If there's no repeating char
    }

    public static Character findFirstRepeatingCharUsingMap(String input) {
        Map<Character, Integer> freqMap = new LinkedHashMap<>();    // LinkedHashMap, insertion order sağlar

        for (char letter : input.toCharArray()) {
            int currentCount = freqMap.getOrDefault(letter, 0);
            freqMap.put(letter, currentCount + 1);
        }

        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > 1) {
                return entry.getKey();
            }
        }

        return null;
    }
}
