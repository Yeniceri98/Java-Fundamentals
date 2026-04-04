package sections.sec99_algorithms_livecoding_practice.algorithms.Binary_Decimal_Conversion;

public class BinaryToDecimal {
    public static void main(String[] args) {
        String binaryInput = "11110";
        int decimalOutput = convertBinaryToDecimalWithCharAt(binaryInput);
        int decimalOutput2 = convertBinaryToDecimalWithToCharArray(binaryInput);
        System.out.println("Binary: " + binaryInput);       // 11110
        System.out.println("Decimal: " + decimalOutput);    // 30
        System.out.println("Decimal: " + decimalOutput2);
    }

    // Better Approach for Performance
    private static int convertBinaryToDecimalWithCharAt(String binaryInput) {
        int decimal = 0;
        int power = binaryInput.length() - 1;   // 11110'da önce 2^4'ten başlayacak ve power gittikçe düşecek

        for (int i = 0; i < binaryInput.length(); i++) {
            // Binary karakterin değeri (0 veya 1)
            char bit = binaryInput.charAt(i);

            // eğer bit '1' ise, 2'nin ilgili kuvvetini ekle
            if (bit == '1') {
                decimal += (int) Math.pow(2, power);
            } else if (bit != '0') {
                throw new IllegalArgumentException("Binary string can only contain 0 or 1");
            }

            power--;
        }

        return decimal;
    }

    private static int convertBinaryToDecimalWithToCharArray(String input) {
        int decimal = 0;
        int power = input.length() - 1;

        for (char c : input.toCharArray()) {
            if (c == '1') {
                decimal += (int) Math.pow(2, power);
            } else if (c != '0') {
                throw new IllegalArgumentException("Binary string can only contain 0 or 1");
            }

            power--;
        }

        return decimal;
    }
}
