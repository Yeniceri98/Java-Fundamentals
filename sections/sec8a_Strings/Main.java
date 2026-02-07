package sections.sec8a_Strings;

public class Main {
    public static void main(String[] args) {
        String name = "Ahmet ";

        name.concat("Sami");            // String immutable olduğu için bu concat işlemini yapmaz (immutable)
        System.out.println(name);       // Ahmet

        name = name.concat("Sami");     // Assigning new variable
        System.out.println(name);       // Ahmet Sami

        name = "Yeniçeri";
        System.out.println(name);       // Yeniçeri

        System.out.println("ABCDEFG".length());

        boolean x = name.equals("Yeniçeri");
        System.out.println(x);      // true

        boolean y = name.equals("yeniçeri");
        System.out.println(y);      // false

        boolean z = name.equalsIgnoreCase("yeniçeri");     // equalsIgnoreCase() büyük-küçük harfi önemsemez
        System.out.println(z);      // true

        int result1 = name.length();                // 5
        char result2 = name.charAt(0);              // A
        int result3 = name.indexOf("h");            // 1
        boolean result4 = name.isEmpty();           // false
        String resul5 = name.toUpperCase();         // AHMET
        String resul6 = name.trim();                // NOTE: trim() metodunu herhangi bir boşluk varsa siler
        String resul7 = name.replace("t", "d");     // Ahmed
    }
}
