package sections.sec98_AlgorithmPatterns;

public class TwoPointer {
    public static void main(String[] args) {
        // EX 1: Two Sum
        int[] array = {1, 2, 3, 4, 5, 6, 7, 14};
        int targetValue = 13;    // It should return true since 7 + 6 = 13
        System.out.println(twoSumApproachOne(array, targetValue));     // Slower complexity
        System.out.println(twoSumApproachTwo(array, targetValue));     // Two Pointer Approach (Better)

        // EX 2: Palindrome Control (Tersten okunuşu da aynı olan kelime)
        String str = "racecar";
        System.out.println(isPalindrome(str));      // true

        String str2 = "apple";
        System.out.println(isPalindrome(str2));     // false
    }

    // First approach uses nested loops, making it O(n²)
    private static boolean twoSumApproachOne(int[] array, int targetValue) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[i] + array[j] == targetValue) {
                    return true;
                }
            }
        }

        return false;
    }

    // Second approach uses two pointers, making it O(n) which is better
    private static boolean twoSumApproachTwo(int[] array, int targetValue) {
        int pointerOne = 0;                     // first element
        int pointerTwo = array.length - 1;      // last element

        while (pointerOne < pointerTwo) {
            int sum = array[pointerOne] + array[pointerTwo];

            if (sum == targetValue) {
                return true;
            } else if (sum < targetValue) {
                pointerOne++;
            } else {
                pointerTwo--;
            }
        }

        return false;
    }

    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;   // Different characters
            }
            left++;
            right--;
        }

        return true;
    }
}

/*
    Two Pointer algoritması, genellikle sıralı diziler veya listeler üzerinde çalışan bir tekniktir
    Bu algoritma, belirli bir koşulu sağlamak için iki farklı pointer kullanarak veri yapısının farklı noktalarını aynı anda işler

    a) Başlangıç ve Bitiş Pointer'ları: İki farklı uçtan başlar ve ortada birleşir
    b) İki Farklı Pointer: Belirli bir kurala göre hareket eder (örneğin, biri yavaş diğeri hızlı olabilir)
    c) Aynı Yönde Hareket Eden Pointer'lar: Örneğin, bir pointer yavaş ilerlerken diğeri hızlı ilerleyebilir

    Bu algoritma, çift yönlü tarama, iki sayı toplamı, palindrom kontrolü gibi birçok problemde kullanılır
    Two Pointer algoritması, zaman kompleksitesini düşürerek büyük veri yapıları üzerinde etkili çözümler sunar
*/