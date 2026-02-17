package sections.sec99_algorithms_livecoding_practice.algorithms.HashMap_Set_Duplicate_Unique_Freq;

import java.util.*;

public class DuplicateWordsInText {
    public static void main(String[] args) {
        String text = "Big black dog and big brown dog";
        System.out.println(duplicateWordsUsingSet(text));   // big dog
        System.out.println(duplicateWordsUsingMap(text));
    }

    public static String duplicateWordsUsingSet(String text) {
        text = text.toLowerCase();
        System.out.println("Before Split: " + text);        // big black dog and big brown dog (duplicate bulabilmek için kelimelere bölmek lazım böyle olmaz)
        String[] splittedText = text.trim().split("\\s+");  // NOTE: split(" ") şeklinde de olurdu fakat bu haliyle tüm whitespace’leri tek separator gibi treat eder
        System.out.println("After Split: " + Arrays.toString(splittedText));    // [big, black, dog, and, big, brown, dog]

        Set<String> seen = new HashSet<>();
        Set<String> duplicates = new LinkedHashSet<>();
        StringBuilder sb = new StringBuilder();

        for (String word : splittedText) {
            if (seen.contains(word)) {
                duplicates.add(word);
            } else {
                seen.add(word);
            }
        }

        for (String word : duplicates) {
            sb.append(word).append(" ");
        }

        System.out.print("Duplicate Words: ");
        return sb.toString();
    }

    public static String duplicateWordsUsingMap(String text) {
        text = text.toLowerCase();
        String[] splittedText = text.trim().split("\\s+");
        System.out.println("Splitted Text: " + Arrays.toString(splittedText));

        Map<String, Integer> wordsMap = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for (String word : splittedText) {
            int currentCount = wordsMap.getOrDefault(word, 0);
            wordsMap.put(word, currentCount + 1);
        }

        for (Map.Entry<String, Integer> entry : wordsMap.entrySet()) {
            if (entry.getValue() > 1) {
                sb.append(entry.getKey()).append(" ");
            }
        }

        System.out.print("Duplicate Words: ");
        return sb.toString();
    }
}
