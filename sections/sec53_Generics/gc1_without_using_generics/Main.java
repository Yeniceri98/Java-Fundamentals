package sections.sec53_Generics.gc1_without_using_generics;

public class Main {
    public static void main(String[] args) {
        IntegerPrinter x = new IntegerPrinter(15);
        DoublePrinter y = new DoublePrinter(10.5d);
        StringPrinter z = new StringPrinter("Ahmet");

        x.print();
        y.print();
        z.print();
    }
}

/*
    Her bir data type için ayrı ayrı classlar oluşturmak zorunda kaldık
    Farklı bir data type kullanırken sadece variable'ın type'ını değiştirmemiz gerektiği için kod benzerlikleri oluştu
    Bu durumun önüne geçmek için generic kullanılmalıdır
*/
