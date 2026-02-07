package sections.sec99_algorithms_livecoding_practice.algorithms.Greedy_FindMinMax;

import java.util.Arrays;
import java.util.List;

public class FindSecondLargestInList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 5, 20, 8, 15);
        System.out.println("Second largest number: " + findSecondLargest(list));
    }

    public static Integer findSecondLargest(List<Integer> numbers) {
        if (numbers == null || numbers.size() < 2) throw new IllegalArgumentException("List must contain at least 2 elements!");

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (Integer num : numbers) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && !num.equals(largest)) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            throw new RuntimeException("No second largest element found. All elements might be equal!");
        }

        return secondLargest;
    }
}
