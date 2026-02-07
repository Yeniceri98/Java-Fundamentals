package sections.sec8b_Strings_BufferedReader_InputStreamReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Vowel_Consonant_Example {
    public static char[] vowels = "aeıioöuü".toCharArray();
    public static char[] consonants = "bcçdfgğhjklmnpqrsştvwxyz".toCharArray();

    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter a String: ");
            String string = bufferedReader.readLine();

            StringBuilder builder1 = new StringBuilder();
            StringBuilder builder2 = new StringBuilder();
            StringBuilder builder3 = new StringBuilder();

            for (char character : string.toCharArray()) {
                if (isVowel(character)) {
                    builder1.append(character).append(" ");
                } else if (isConsonant(character)) {
                    builder2.append(character).append(" ");
                } else if (character != ' ') {
                    builder3.append(character).append(" ");
                }
            }

            System.out.println(builder1);
            System.out.println(builder2);
            System.out.println(builder3);
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character);  // Convert to lowercase
        for (char vowel : vowels) {  // Look for vowels in the array
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }

    // The method checks whether a letter is a consonant
    public static boolean isConsonant(char character) {
        character = Character.toLowerCase(character);  // Convert to lowercase
        for (char vowel : consonants) {  // Look for consonants in the array
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }
}

