package sections.sec13_For_Loop;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        for (int i = 0; i <= 10; i += 2) {
            System.out.println(i);
        }

        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Elements in the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " ");
        }

        // For-Each Loop
        String[] names = {"Ahmet", "Sami", "Yeniçeri"};
        for (String i : names) {
            System.out.println(i);
        }

        ArrayList<String> animals = new ArrayList<>();
        animals.add("Bird");
        animals.add("Dog");
        animals.add("Cat");

        for (String i : animals) {
            System.out.println(i);
        }
    }
}
