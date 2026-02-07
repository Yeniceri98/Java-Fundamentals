package sections.sec98_AlgorithmPatterns;

import java.util.HashSet;

public class SlidingWindow {
    public static void main(String[] args) {
        // EX 1 - Fixed Size: Finding the largest sum of subsequences of length k
        int[] nums = {2, 1, 5, 1, 3, 2};
        int k = 3;
        //System.out.println(maxSum(nums, k));    // Returns 9 (5 + 1 + 3)

        // EX 2 - Flexible Size: Finding the longest non-repeating substring in a given string
        String str = "abcdbcbb";
        System.out.println(lengthOfLongestSubstring(str));  // Returns 4 (abcd)
    }

    /*
        Algoritma Mantığı:
        - İlk k elemanın toplamını hesapla
        - Pencereyi bir eleman sağa kaydırarak, soldan çıkar ve sağdan ekle
        - Maksimum toplamı güncelle
    */
    public static int maxSum(int[] nums, int k) {
        int maxSum = 0, currentSum = 0;

        // İlk pencerenin toplamı (2 + 1 + 5)
        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
        }
        maxSum = currentSum;

        // Pencereyi kaydırarak yeni toplamları hesaplama
        for (int i = k; i < nums.length; i++) {
            currentSum += nums[i] - nums[i - k];    // Sağdan ekle (nums[i]) soldan çıkar (nums[i - k])
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;

        /*
            Başlangıç: 2, 1, 5, 1, 3, 2
            İlk önce 2 + 1 + 5 = 8 ile currentSum bulundu

            Kaydır 1: [1, 5, 1]
            i = 3, k = 3
            Yeni eklenen: nums[3] = 1
            Çıkarılan: nums[3 - 0] = nums[0] = 2
            Yeni toplam: 8 + 1 - 2 = 7
            maxSum güncellenmez, çünkü 8 > 7

            Kaydır 2: [5, 1, 3]
            i = 4, k = 3
            Yeni eklenen: nums[4] = 3
            Çıkarılan: nums[4 - 3] = nums[1] = 1
            Yeni toplam: 7 + 3 - 1 = 9
            maxSum = 9

            Kaydır 3: [1, 3, 2]
            i = 5, k = 3
            Yeni eklenen: nums[5] = 2
            Çıkarılan: nums[5 - 3] = nums[2] = 5
            Yeni toplam: 9 + 2 - 5 = 6
            maxSum değişmez, çünkü 9 > 6
        */
    }

    /*
        Algoritma Mantığı
        left pointer başlangıçtan başlar
        right pointer ilerler ve karakterleri HashSet’e ekler
        Eğer tekrar eden bir karakter varsa left pointer ilerletilir
        En soldaki karakteri (left) kaldırıyoruz, çünkü yeni gelen karakter daha önce pencerede var ve tekrarsız olması gerekiyor
        Pencereyi sola kaydırarak küçültüyoruz, böylece right işaretçisi ilerlemeye devam edebilir
        Bu yöntem her karakteri en fazla 2 kez işler → O(N) sürede çalışır
    */
    public static int lengthOfLongestSubstring(String str) {
        int left = 0, maxLength = 0;
        HashSet<Character> charSet = new HashSet<>();

        for (int right = 0; right < str.length(); right++) {
            while (charSet.contains(str.charAt(right))) {
                charSet.remove(str.charAt(left));
                left++;
            }
            charSet.add(str.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}

/*
    Sliding Window algoritması, büyük veri yapıları üzerinde işlem yaparken, sabit veya değişken uzunlukta bir pencere kullanarak veriyi tarama yöntemidir

    Bu teknik aşağıdaki işlemler için idealdir:
    - Alt dizi (substring, subarray) işlemleri
    - Maksimum / minimum toplam
    - Tekrar etmeyen karakterler
    - Dizilerde belirli bir koşulu sağlayan en uzun/kısa alt dizi bulma gibi işlemler için idealdir

    a) Sabit Boyutlu Pencere (Fixed-Size):
    - Belirli uzunluktaki alt dizinin maksimum / minimum toplamını bulma
    - Kaydırmalı ortalama hesaplama

    b) Değişken Boyutlu Pencere (Flexible-Size):
    - Tekrarsız en uzun alt dizi bulma
    - Belirli bir toplamı sağlayan en kısa alt dizi bulma

    If Li >= Lj then Ri >= Rj, where Li and Lj are the left side of some ranges, and Ri and Rj are the left ends of the same ranges
    Basically, the technique lets us iterate over the array holding two pointers L and R
    These pointers indicate the left and right ends of the current range
    In each step, we either move L, R, or both of them to the next range

    In order to do this, we must be able to add elements to our current range when we move R forward
    Also, we must be able to delete elements from our current range when moving L forward
    Each time we reach a range, we calculate its answer from the elements we have inside the current range

    In case the length of the ranges is fixed, we call this the fixed-size sliding window technique
    However, if the lengths of the ranges are changed, we call this the flexible window size technique
*/