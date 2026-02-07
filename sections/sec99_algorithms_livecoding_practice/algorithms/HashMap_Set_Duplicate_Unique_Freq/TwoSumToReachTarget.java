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

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();

        System.out.println("target: " + target + "\n");

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            System.out.println("nums[i]: " + nums[i]);
            System.out.println("complement: " + complement);

            // If the complement exists in the map, we found our pair
            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };
            }

            // Store the current number and its index
            numMap.put(nums[i], i);
            System.out.println("numMap: " + numMap + "\n");
        }

        // No solution found
        return new int[0];
    }
}
