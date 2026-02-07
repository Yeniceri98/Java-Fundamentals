package sections.sec99_algorithms_livecoding_practice.algorithms.DynamicProgramming;

public class MaxSubArraySum {
    public static void main(String[] args) {
        int[] arr = {-2, 1, 5, 3, -4, 7, -3, 9};
        System.out.println(maxSubArray(arr));
    }

    public static int maxSubArray(int[] nums) {
        int max = nums[0];
        int currentMax = nums[0];

        for (int num : nums) {
            currentMax = Math.max(num, currentMax + num);
            max = Math.max(max, currentMax);
        }

        return max;
    }
}
