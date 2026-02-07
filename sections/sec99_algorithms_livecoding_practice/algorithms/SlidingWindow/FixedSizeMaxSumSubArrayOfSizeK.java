package sections.sec99_algorithms_livecoding_practice.algorithms.SlidingWindow;

public class FixedSizeMaxSumSubArrayOfSizeK {
    public static void main(String[] args) {
        int[] array = {4, 1, 7, 9, 12, 20, 3};

        // k = 3 veriyoruz yani window boyutu baştan belli (fixed size)
        System.out.println(findMaxSumSubArrayOfSizeK(array, 3));    // 20 + 12 + 9 = 41
    }

    private static int findMaxSumSubArrayOfSizeK(int[] array, int k) {
        if (k < 0 || k > array.length) throw new IllegalArgumentException("Invalid k");

        int windowSum = 0;

        // İlk k'ya kadarki elemanların toplamını yazdırır (4+1+7)
        for (int i = 0; i < k; i++) {
            windowSum += array[i];
        }

        // Başlangıçta, ilk k'ya kadarki elemanların toplamını maxSum olarak belirler
        int maxSum = windowSum;

        // İlk index olarak k değerini baz alıp sağa doğru kaydırmaya başlar
        for (int right = k; right < array.length; right++) {
            windowSum += array[right];      // Sağa kaydırıp ekler
            windowSum -= array[right - k];  // En soldakini çıkarır
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }
}
