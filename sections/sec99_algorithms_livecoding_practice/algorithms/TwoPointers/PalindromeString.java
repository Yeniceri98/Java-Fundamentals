package sections.sec99_algorithms_livecoding_practice.algorithms.TwoPointers;

public class PalindromeString {
    public static void main(String[] args) {
        System.out.println("Java: " + isPalindrome("Java"));        // false
        System.out.println("Kayak: " + isPalindrome("Kayak"));      // true
        System.out.println("Spring: " + isPalindrome("Spring"));    // false
        System.out.println("Kabak: " + isPalindrome("Kabak"));      // true
    }

    public static boolean isPalindrome(String input) {
        if (input == null) return false;

        // Indexes
        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            if (input.toLowerCase().charAt(left) != input.toLowerCase().charAt(right)) {
                return false;  // No match
            }
            left++;
            right--;
        }

        return true;
    }
}
