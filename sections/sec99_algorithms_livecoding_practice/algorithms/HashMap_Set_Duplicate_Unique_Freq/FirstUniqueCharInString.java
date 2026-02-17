package sections.sec99_algorithms_livecoding_practice.algorithms.HashMap_Set_Duplicate_Unique_Freq;

import java.util.*;

public class FirstUniqueCharInString {
    public static void main(String[] args) {
        System.out.println(firstUniqueChar("xxxyyzf"));  // z
        System.out.println(firstUniqueChar("xyz"));      // x
    }

    public static Character firstUniqueChar(String str) {
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
}
