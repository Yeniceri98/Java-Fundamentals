package sections.sec99_algorithms_livecoding_practice.algorithms.HashMap_Set_Duplicate_Unique_Freq;

import java.util.HashMap;
import java.util.Map;

public class FirstAndLastSeenIndex {
    public static void main(String[] args) {
        System.out.println("First Seen Index: " + firstSeenIndex("abcab"));  // {a=0, b=1, c=2}
        System.out.println("Last Seen Index: " + lastSeenIndex("abcabc"));   // {a=3, b=4, c=5}
    }

    private static Map<Character, Integer> firstSeenIndex(String text) {
        Map<Character, Integer> firstIndex = new HashMap<>();

        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            firstIndex.putIfAbsent(letter, i);   // Key yoksa ekler, varsa dokunmaz
        }

        return firstIndex;
    }

    private static Map<Character, Integer> lastSeenIndex(String text) {
        Map<Character, Integer> lastIndex = new HashMap<>();

        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            lastIndex.put(letter, i);        // Map, her seferinde map son görülen key'e göre indexi günceller
        }

        return lastIndex;
    }
}
