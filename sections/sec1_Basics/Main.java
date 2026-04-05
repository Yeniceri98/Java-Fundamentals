package sections.sec1_Basics;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");      // "sout" snippetiyle kısa yoldan da yazdırılabilir

        // ___ PRIMITIVE TYPES ___
        byte theByte = -128;            // -128 to 127  --->  1 byte
        short theShort = 3729;          // -32,768 to 32,767  --->  2 bytes
        int number = 5212313;           // -2,147,483,648 to 2,147,483,647  --->  4 bytes
        int numberTwo = 521_234_322;    // Kolay okuyabilmek için bu şekilde de yazılabilir (Diğerleri için de geçerli)
        long theLong = 278282929L;      // -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807  --->  6 bytes
        float pi = 3.14F;               // Sonuna f veya F koyulmalıdır
        double doublePi = 3.1426;
        boolean isAdult = true;
        char theChart = 'A';

        System.out.println(number);
        System.out.println(numberTwo);
        System.out.println(pi);
        System.out.println(isAdult);

        // String -> Char Special Condition
        /*
            PrintStream.println(char[]) özel overload’a sahiptir.
            char[] için JVM, array’i String gibi basar.
            Yani karakterleri yan yana yazar.
            Bu özel davranış sadece char[] içindir (İlk print'teki abcd)
        */
        String input = "abcd";
        char[] inputArray = input.toCharArray();

        System.out.println(inputArray);                     // abcd
        System.out.println(Arrays.toString(inputArray));    // [a, b, c, d]

        // TYPE CONVERSIONS
        /*
            Primitive dönüşüm performans açısından daha verimlidir çünkü nesne oluşturmaz
            - Integer.parseInt()
            - Double.parseDouble()
            - Long.parseLong()
            - Boolean.parseBoolean()
            - Float.parseFloat()

            Autoboxing ile primitive değerleri Integer, Double gibi nesnelere çevirirken valueOf() kullanılır
            Cache avantajı sağlar (-128 ile 127 arasındaki Integer değerleri cache'den alır)
            - Integer.valueOf()
            - Double.valueOf()
            - Long.valueOf()
            - Boolean.valueOf()

            String Dönüşümü
            - String.valueOf() ve toString() metotları kullanılabilir
            - String.valueOf() null güvenlidir ve hata vermez
            - toString() null bir nesne çağırırsa NullPointerException fırlatır
            - Integer -> String dönüşümünde her 2 yöntem de kullanılabilirken; int -> String dönüşümünde sadece String.valueOf() kullanılabilir
            - Çünkü int bir primitive türdür ve toString() metodu olamaz

            Statik yöntemle String dönüşümü:
            - Integer.toString(int x)
            - Double.toString(double x)
            - Float.toString(float x)

            ÖRNEKLER:

            a) Statik yöntemle (Önerilen yöntem)
            Double doubleValue1 = 2.22;
            String string1 = Double.toString(doubleValue1);     // static and safe

            b) Nesne üzerinden çağırarak (Alternatif yöntem)
            Double doubleValue1 = 2.22;
            String string1 = doubleValue1.toString();           // null olursa hata alınır

            c) String.valueOf() Kullanarak (Null-safe alternatif)
            Double doubleValue1 = 2.22;
            String string1 = String.valueOf(doubleValue1);      // null safe
        */

        // Widening Casting (Küçükten Büyüğe)
        int intValue = 100;
        double doubleValue = intValue;  // Otomatik dönüşüm
        System.out.println("int to double: " + doubleValue);

        // Narrowing Casting (Büyükten Küçüğe)
        double piValue = 3.14;
        int truncatedPi = (int) pi;
        System.out.println("double to int: " + truncatedPi);

        // Primitive to Wrapper Class (Autoboxing)
        int primitiveInt = 50;
        Integer wrapperInt = primitiveInt;  // int -> Integer
        System.out.println("int to Integer: " + wrapperInt);

        // Wrapper Class to Primitive (Unboxing)
        Double wrapperDouble = 42.5;
        double primitiveDouble = wrapperDouble;     // Double -> double
        System.out.println("Double to double: " + primitiveDouble);

        // String to int & String to Integer
        String strNum = "123";
        int parsedInt = Integer.parseInt(strNum);   // String -> int
        int valueOfInt = Integer.valueOf(strNum);   // String -> Integer
        System.out.println("String to int: " + parsedInt);
        System.out.println("String to Integer: " + valueOfInt);

        // Integer to String & int to String
        Integer num1 = 10;
        int num2 = 15;
        String conversionByStaticApproach = Integer.toString(num1);
        String strFromInteger = num1.toString();
        String strFromInteger2 = String.valueOf(num1);
        String strFromInt = String.valueOf(num2);
        System.out.println("conversionByStaticApproach: " + conversionByStaticApproach);
        System.out.println("strFromInteger: " + strFromInteger);
        System.out.println("strFromInteger2: " + strFromInteger2);
        System.out.println("strFromInt: " + strFromInt);

        // String to Double & String to Float
        String strDouble = "5.55";
        Double double1 = Double.parseDouble(strDouble);     // String -> double
        Double double2 = Double.valueOf(strDouble);         // String -> Double
        Float float1 = Float.parseFloat(strDouble);
        Float float2 = Float.valueOf(strDouble);
        System.out.println("double1 and double2: " + double1 + " & " + double2);
        System.out.println("float1 and float2: " + float1 + " & " + float2);

        // Double to String & double to String
        Double wrapperDoubleValue = 2.22;
        double primitiveDoubleValue = 2.22;
        String conversionByStaticMethod = Double.toString(wrapperDouble);
        String conversionFromWrapper1 = wrapperDoubleValue.toString();
        String conversionFromWrapper2 = String.valueOf(wrapperDoubleValue);
        String conversionFromPrimitive = String.valueOf(primitiveDoubleValue);
        System.out.println("conversionByStaticMethod: " + conversionByStaticMethod);
        System.out.println("conversionFromWrapper1: " + conversionFromWrapper1);
        System.out.println("conversionFromWrapper2: " + conversionFromWrapper2);
        System.out.println("conversionFromPrimitive: " + conversionFromPrimitive);


        // Difference Between Primitives and Reference Types
        int a = 10;
        int b = a;      // Copy
        a = 100;
        System.out.println("a: " + a + " b: " + b);     // a: 100 b: 10


        // REFERENCE TYPES
        String name = "Ahmet";                         // String Literal
        String name2 = new String("Sami");             // String Object
        System.out.println(name.toUpperCase());
        System.out.println(name2);

        LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println(now.getMonth());            // Reference type'larda "." koyup oluşturduğumuz objeye metod ataması yapabiliyoruz. Primitive'lerde bu işlem yapılamıyor

        Date date = new Date();
        System.out.println(date);


        // Difference Between Primitives and Reference Types
        Person alex = new Person("Alex");
        Person mariam = alex;

        System.out.println("Before changing alex");
        System.out.println(alex.name + "-" + mariam.name);      // Output: Alex-Alex

        alex.name = "Tom";
        // mariam.name = "Jerry";       // Yorum satırında olmasaydı Tom-Tom değil Jerry-Jerry yazdırırdı

        System.out.println("After changing alex");
        System.out.println(alex.name + "-" + mariam.name);      // Output: Tom-Tom


        // STRING CLASS
        String country = new String("Turkey");              // "country" adında obje oluşturulmuş oluyor ve buna metod ataması yapabiliyoruz
        System.out.println(country);
        System.out.println(country.toUpperCase());
        System.out.println(country.charAt(3));              // 3. indexteki harfi yazdırır (k)

        String code = new String("coder");
        System.out.println(code.contains("code"));          // "coder" kelimesinin içinde "code" olduğu için output true olur

        String city = "ISTANBUL";
        System.out.println(city);
        System.out.println(city.toLowerCase());

        System.out.println(country.equals(code));           // "country" class'ıyla "code" class'ının aynı olup olmadığına bakar ve aynı olmadığı için output false olur
    }

    static class Person {
        String name;

        Person(String name) {
            this.name = name;
        }
    }
}
