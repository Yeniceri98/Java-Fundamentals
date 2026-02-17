package sections.sec99_algorithms_livecoding_practice.algorithms.HashMap_Set_Duplicate_Unique_Freq;

import java.util.HashMap;
import java.util.Map;

// Finds two numbers' index in the array that add up to the target value
public class TwoSumToReachTarget {
    public static void main(String[] args) {
        int[] nums = {2, 4, 1, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println(result[0] + ", " + result[1]);   // 0, 3
    }


    public static int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> valueToIndexMap = new HashMap<>();

        for (int currentIndex = 0; currentIndex < numbers.length; currentIndex++) {
            int currentValue = numbers[currentIndex];
            int neededValue = target - currentValue;

            // Aranan değer (needed value) map'te varsa sonucu bulduk demektir
            if (valueToIndexMap.containsKey(neededValue)) {
                int foundIndex = valueToIndexMap.get(neededValue);
                return new int[]{foundIndex, currentIndex};
            }

            // Mevcut değeri map'e ekle
            valueToIndexMap.put(currentValue, currentIndex);
        }

        throw new IllegalArgumentException("No two sum solution found");
    }
}
