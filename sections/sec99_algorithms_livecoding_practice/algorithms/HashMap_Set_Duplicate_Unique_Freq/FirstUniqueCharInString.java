package sections.sec99_algorithms_livecoding_practice.algorithms.HashMap_Set_Duplicate_Unique_Freq;

import java.util.*;

public class FirstUniqueCharInString {
    public static void main(String[] args) {
        System.out.println(firstUniqueCharSolutionOne("xxxyyzf"));  // z
        System.out.println(firstUniqueCharSolutionTwo("xxxyyzf"));  // z
        System.out.println(firstUniqueCharSolutionTwo("xyz"));      // x
    }

    public static Character firstUniqueCharSolutionOne(String str) {
        if (str == null || str.isEmpty()) return null;

        Map<Character, Integer> charMap = new HashMap<>();

        for (char letter : str.toCharArray()) {
            int currentCount = charMap.getOrDefault(letter, 0);     // Map'te ilgili key varsa onun değeri; yoksa 0
            charMap.put(letter, currentCount + 1);
        }

        System.out.println("Final Map: " + charMap);    // {f=1, x=3, y=2, z=1}

        for (char letter : str.toCharArray()) {
            if (charMap.get(letter) == 1) {
                return letter;
            }
        }

        return null;
    }

    public static Character firstUniqueCharSolutionTwo(String str) {
        Map<Character, Integer> freqMap = new LinkedHashMap<>();    // LinkedHashMap: Bu çözüm için insertion order şart

        for (char letter : str.toCharArray()) {
            int currentCount = freqMap.getOrDefault(letter, 0);
            freqMap.put(letter, currentCount + 1);
        }

        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return null;

    }
}
