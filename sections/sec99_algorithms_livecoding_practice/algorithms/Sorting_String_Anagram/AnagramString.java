package sections.sec99_algorithms_livecoding_practice.algorithms.Sorting_String_Anagram;

import java.util.Arrays;

public class AnagramString {
    public static void main(String[] args) {
        System.out.println(isAnagram("Listen", "Silent"));  // true
        System.out.println(isAnagram("Hello", "World"));    // false
    }

    public static boolean isAnagram(String str1, String str2) {
        if (str1 == null || str2 == null || str1.length() != str2.length()) return false;

        char[] arr1 = str1.toLowerCase().toCharArray();     // [l, i, s, t, e, n]
        char[] arr2 = str2.toLowerCase().toCharArray();     // [s, i, l, e, n, t]

        Arrays.sort(arr1);  // [e, i, l, n, s, t]
        Arrays.sort(arr2);  // [e, i, l, n, s, t]

        return Arrays.equals(arr1, arr2);
    }
}

