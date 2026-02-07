package sections.sec99_algorithms_livecoding_practice.algorithms.HashMap_Set_Duplicate_Unique_Freq;

import java.util.*;

public class DuplicateCharactersInWord {
    public static void main(String[] args) {
        System.out.println(duplicateCharacters("happy"));   // p
        System.out.println(duplicateCharacters("banana"));  // an
        System.out.println(duplicateCharacters("aabbcc"));  // abc
        System.out.println(duplicateCharacters("abcdef"));  //
    }

    public static String duplicateCharacters(String input) {
        Set<Character> seen = new HashSet<>();
        Set<Character> duplicates = new LinkedHashSet<>();  // Insertion order vardır. Eğer HashSet kullanılırsa "banana" için "an" bekliyorsun ama bazen "na" şeklinde gelebilir
        StringBuilder sb = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (seen.contains(c)) {
                duplicates.add(c);  // Add to duplicates if already seen
            } else {
                seen.add(c);        // Mark character as seen
            }
        }

        // Append duplicate chars to StringBuilder and return as String
        for (char c : duplicates) {
            sb.append(c);
        }

        return sb.toString();
    }
}
