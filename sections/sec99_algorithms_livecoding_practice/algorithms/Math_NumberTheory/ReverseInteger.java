package sections.sec99_algorithms_livecoding_practice.algorithms.Math_NumberTheory;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println("Reverse of 123: " + reverse(123));      // 321
        System.out.println("Reverse of -456: " + reverse(-456));    // -654
    }

    public static int reverse(int number) {
        int reversedNum = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNum = reversedNum * 10 + digit;
            number /= 10;
        }

        return reversedNum;
    }
}

/*
    digit = num % 10:                   son basamağı alır (örneğin 123 % 10 → 3)
    reversed = reversed * 10 + digit:   ters sayı oluşturulur (örneğin 32 * 10 + 1 → 321)
    num /= 10:                          son basamak çıkarılır, sayı küçültülür (örneğin 123 / 10 → 12)
*/