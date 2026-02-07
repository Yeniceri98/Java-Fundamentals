package sections.sec99_algorithms_livecoding_practice.algorithms.HashMap_Set_Duplicate_Unique_Freq;

import java.util.*;

public class FirstUniqueCharInString {
    public static void main(String[] args) {
        System.out.println(firstUniqueCharUsingMap("xxxyyz"));  // z
        System.out.println(firstUniqueCharUsingSet("xxxyyz"));  // z
    }

    // Better Approach
    public static Character firstUniqueCharUsingMap(String str) {
        if (str == null || str.isEmpty()) return null;

        Map<Character, Integer> charMap = new HashMap<>();

        for (char letter : str.toCharArray()) {
            int currentCount = charMap.getOrDefault(letter, 0);     // Map'te ilgili key varsa onun değeri yoksa 0
            charMap.put(letter, currentCount + 1);
        }

        System.out.println("Final Map: " + charMap);

        for (char letter : str.toCharArray()) {
            if (charMap.get(letter) == 1) {
                return letter;
            }
        }

        return null;
    }

    public static Character firstUniqueCharUsingSet(String str) {
        if (str == null) return null;

        Set<Character> seenOnce = new LinkedHashSet<>();
        Set<Character> seenMultiple = new HashSet<>();

        for (char letter : str.toCharArray()) {
            if (seenMultiple.contains(letter)) {
                continue;
            } else if (seenOnce.contains(letter)) {
                seenOnce.remove(letter);
                seenMultiple.add(letter);
            } else {
                seenOnce.add(letter);
            }
        }

        return seenOnce.isEmpty() ? null : seenOnce.iterator().next();
    }
}
