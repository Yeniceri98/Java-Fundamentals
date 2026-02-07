package sections.sec99_algorithms_livecoding_practice.algorithms.HashMap_Set_Duplicate_Unique_Freq;

import java.util.*;

public class MostFrequentNumberInArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 3, 4, 3, 5, 7, 3};
        System.out.println("Most Frequent Number: " + mostFrequentNumber(arr));    // 3
    }

    public static int mostFrequentNumber(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        int maxCount = 0;
        int mostFrequentNum = nums[0];

        for (int num : nums) {
            int currentCount = freqMap.getOrDefault(num, 0);    // Mevcut sayım değerini al
            freqMap.put(num, currentCount + 1);                 // Sayımı 1 artır
        }

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequentNum = entry.getKey();
            }
        }

        System.out.println("Max Count: " + maxCount);
        return mostFrequentNum;
    }
}