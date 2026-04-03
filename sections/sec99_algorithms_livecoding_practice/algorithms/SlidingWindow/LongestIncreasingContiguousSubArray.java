package sections.sec99_algorithms_livecoding_practice.algorithms.SlidingWindow;

public class LongestIncreasingContiguousSubArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 6, 1, 5, 7};
        System.out.println(findLengthOfLongestIncreasingContiguousSubArray(array));     // Returns 4 (2, 3, 4, 6)
    }

    public static int findLengthOfLongestIncreasingContiguousSubArray(int[] arr) {
        if (arr.length == 0) return 0;

        int maxLength = 1;
        int currentLength = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {  // Eğer bir önceki sayıdan büyükse alt dizi devam ediyor
                currentLength++;
                maxLength = Math.max(maxLength, currentLength);
            } else {
                currentLength = 1;  // Dizi kesildi, sıfırdan başla
            }
        }

        return maxLength;
    }
}
