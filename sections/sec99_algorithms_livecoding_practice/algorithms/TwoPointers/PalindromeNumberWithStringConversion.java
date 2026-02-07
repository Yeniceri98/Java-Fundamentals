package sections.sec99_algorithms_livecoding_practice.algorithms.TwoPointers;

public class PalindromeNumberWithStringConversion {
    public static void main(String[] args) {
        System.out.println(isPalindromeUsingStringConversion(121));
        System.out.println(isPalindromeUsingStringConversion(123));
    }

    // NOTE: PalindromeString.java'daki yöntem
    public static boolean isPalindromeUsingStringConversion(int num) {
        String numStr = String.valueOf(num);
        int left = 0;
        int right = numStr.length() - 1;

        while (left < right) {
            if (numStr.charAt(left) != numStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
