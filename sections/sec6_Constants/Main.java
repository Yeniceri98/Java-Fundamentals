package sections.sec6_Constants;

public class Main {
    public static void main(String[] args) {
        float pi = 3.14F;
        pi = 2F;


        final float PI = 3.14F;     // "final" keyword'ü sayesinde "PI" değişkeninin değerini güncelleyemeyiz. Değerini değiştirmek istemediğimiz değişkenlerde kullanılmalıdır
        // PI = 1;                  // Error

        // Final variable'ı initialize etmeden oluşturup sonrasında değer atayabiliriz
        final int x;
        x = 5;
    }
}
