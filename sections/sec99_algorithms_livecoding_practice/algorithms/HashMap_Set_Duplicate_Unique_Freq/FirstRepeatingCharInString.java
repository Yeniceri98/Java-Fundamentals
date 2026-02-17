package sections.sec99_algorithms_livecoding_practice.algorithms.HashMap_Set_Duplicate_Unique_Freq;

import java.util.*;

public class FirstRepeatingCharInString {
    public static void main(String[] args) {
        System.out.println(findFirstRepeatingChar("abcdefab"));     // a
    }

    public static Character findFirstRepeatingChar(String input) {
        char[] inputArray = input.toCharArray();    // [a, b, c, d, e, f, a, b]
        System.out.println("inputArray: " + Arrays.toString(inputArray));

        Set<Character> seen = new HashSet<>();

        for (char letter : inputArray) {
            if (seen.contains(letter)) {
                return letter;
            } else {
                seen.add(letter);
            }
        }

        return null;    // If there's no repeating char
    }
}
