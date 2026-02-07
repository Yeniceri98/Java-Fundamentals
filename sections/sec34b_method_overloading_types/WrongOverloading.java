package sections.sec34b_method_overloading_types;

class Calculation {
    public int getTotal(int a, int b) {
        return a + b;
    }

    /*
        Alttaki gibi sadece return type'ı değiştirerek overload yapamayız
        Program hangi metodu kullanacağını bilemez
        Compile time'da hata alırız (Programı çalıştırmadan hata olduğu gösterir)

        public double getTotal(int a, int b) {
            return a + b;
        }
    */
}

public class WrongOverloading {
    public static void main(String[] args) {
        Calculation calculation = new Calculation();
        calculation.getTotal(10, 15);
    }
}
