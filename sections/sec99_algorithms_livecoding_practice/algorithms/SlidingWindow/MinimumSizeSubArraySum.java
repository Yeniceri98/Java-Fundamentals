package sections.sec99_algorithms_livecoding_practice.algorithms.SlidingWindow;

public class MinimumSizeSubArraySum {
    public static void main(String[] args) {
        int[] array = {3, 1, 5, 7, 2, 9, 10};
        System.out.println(minLengthSubArrayWithSumAtLeast(array, 23));  // Returns 4 (5 + 7 + 2 + 9)
    }

    private static int minLengthSubArrayWithSumAtLeast(int[] array, int target) {
        int left = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;

        for (int right = 0; right < array.length; right++) {
            sum += array[right];

            // 3 + 1 + 5 + 7 + 2 + 9 = 27'ye kadar toplar ve while'a girer. Güncel length: 6
            while (sum >= target) {
                minLen = Math.min(minLen, right - left + 1);  // window length = right - left + 1
                sum -= array[left];  // Sol taraftan küçültmeye başlıyoruz (İlk baştan 3 değeri siliniyor). En soldaki değer silindikten sonra sum hala >= target ise işlem devam edecek ve pencereye sağa doğru kayacak
                left++;              // Küçülttükten sonra kaydırıyoruz (left değeri ilk başta 3 iken 1 olmuş olur)
            }
        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}

// Toplamı en az target kadar olan en kısa subarray’in uzunluğunu bulma. Yani örneğe göre toplamı 23'ü geçen minimum pencere aralığı