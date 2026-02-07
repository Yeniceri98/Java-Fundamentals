package sections.sec99_algorithms_livecoding_practice.algorithms.Stack;

import java.util.Stack;

public class ReverseStringWithStack {
    public static void main(String[] args) {
        String input = "ahmet";
        reverseString(input);
    }

    private static void reverseString(String input) {
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
            System.out.println(c);
        }

        StringBuilder temp = new StringBuilder();

        while (!stack.empty()) {
            temp.append(stack.pop());
            System.out.println("Temp: " + temp);
        }

        System.out.println("Reversed: " + temp);
    }
}
