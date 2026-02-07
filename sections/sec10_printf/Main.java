package sections.sec10_printf;

public class Main {
    public static void main(String[] args) {
        System.out.printf("I'm %d years old", 23);          // I'm 23 years old
        System.out.println();

        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Ahmet";
        int myInt = 50;
        double myDouble = 1500.12345;

        System.out.printf("%b", myBoolean);
        System.out.printf("%c", myChar);
        System.out.printf("%s", myString);
        System.out.printf("%d", myInt);
        System.out.printf("%f", myDouble);
        System.out.println();

        // Width:
        System.out.printf("Hello %10s \n", myString);       // Hello kelimesinden sonra myString değerinin sonuna kadar 10 harf boşluk olmasını sağlar (5 boşluk ve 5 harflik Ahmet yazısıyla 10 olur)
        System.out.printf("Hello %-10s \n", myString);      // myString değerinden sonra 10 harflik boşluk ekler

        // Precision:
        System.out.printf("You have %f \n", myDouble);       // 1500,123450
        System.out.printf("You have %.3f \n", myDouble);     // 1500,123 (Virgülden sonra 3 basamak olmasını sağlar)
    }
}

// format strings + object/variable/value
