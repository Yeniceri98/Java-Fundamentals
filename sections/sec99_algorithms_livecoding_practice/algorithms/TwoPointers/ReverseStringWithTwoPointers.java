package sections.sec99_algorithms_livecoding_practice.algorithms.TwoPointers;

public class ReverseStringWithTwoPointers {
    public static void main(String[] args) {
        String input = "ahmet";
        reverseString(input);
    }

    private static void reverseString(String input) {
        char[] charArray = input.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            // Swap
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            left++;
            right--;
        }

        String reversed = new String(charArray);
        System.out.println("Reversed: " + reversed);
    }
}
