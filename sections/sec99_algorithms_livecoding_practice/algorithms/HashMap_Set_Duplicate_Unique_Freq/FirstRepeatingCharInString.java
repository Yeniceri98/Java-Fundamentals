package sections.sec99_algorithms_livecoding_practice.algorithms.HashMap_Set_Duplicate_Unique_Freq;

import java.util.*;

public class FirstRepeatingCharInString {
    public static void main(String[] args) {
        System.out.println(findFirstRepeatingCharSolutionOne("abcdefab"));     // a
        System.out.println(findFirstRepeatingCharSolutionTwo("xyz"));          // null
    }

    public static Character findFirstRepeatingCharSolutionOne(String input) {
        char[] inputArray = input.toCharArray();
        System.out.println("inputArray: " + Arrays.toString(inputArray));

        Set<Character> seen = new HashSet<>();

        for (char letter : inputArray) {
            if (seen.contains(letter)) {
                return letter;
            } else {
                seen.add(letter);
            }
        }

        return null;
    }

    // Without Converting to Char Array (Better for Memory and Performance)
    public static Character findFirstRepeatingCharSolutionTwo(String input) {
        Set<Character> seen = new HashSet<>();

        // NOTE: input.charAt() for-each içerisinde kullanılamaz çünkü for-each sadece koleksiyonlar ve dizi üzerinde çalışabilir
        for (int i = 0; i < input.length(); i++) {
            char letter = input.charAt(i);

            if (seen.contains(letter)) {
                return letter;
            } else {
                seen.add(letter);
            }
        }

        return null;
    }
}
