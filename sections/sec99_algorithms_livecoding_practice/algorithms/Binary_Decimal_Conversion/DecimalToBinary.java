package sections.sec99_algorithms_livecoding_practice.algorithms.Binary_Decimal_Conversion;

public class DecimalToBinary {
    public static void main(String[] args) {
        int decimalInput = 30;
        String binaryOutput = convertDecimalToBinary(decimalInput);

        System.out.println("Decimal: " + decimalInput);     // 30
        System.out.println("Binary: " + binaryOutput);      // 11110
    }

    public static String convertDecimalToBinary(int decimalInput) {
        if (decimalInput == 0) return "0";
        if (decimalInput < 0) throw new IllegalArgumentException("Only non-negative numbers are supported");

        StringBuilder sb = new StringBuilder();

        // Sayı 0'dan büyük olduğu sürece 2'ye bölerek ilerle
        while (decimalInput > 0) {
            int remainder = decimalInput % 2;   // Kalanı bul (0 veya 1)
            sb.append(remainder);
            decimalInput = decimalInput / 2;    // Bölmeye devam et
        }

        // Kalanlar tersten geldiği için reverse yapılır
        return sb.reverse().toString();
    }
}
