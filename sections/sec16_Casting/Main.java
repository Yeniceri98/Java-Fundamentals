package sections.sec16_Casting;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        /*
            Type casting is when you assign a value of one primitive data type to another type
            In Java, there are two types of casting:

            1) Widening Casting (automatically) - converting a smaller type to a larger type size
            byte -> short -> char -> int -> long -> float -> double

            2) Narrowing Casting (manually) - converting a larger type to a smaller size type
            double -> float -> long -> int -> char -> short -> byte
        */

        // Widening Casting
        int myInt = 5;
        double myDouble = myInt;

        System.out.println(myInt);          // Output: 5
        System.out.println(myDouble);       // Output: 5.0

        // Narrowing Casting
        double myDoubleTwo = 15.75;
        int myIntTwo = (int) myDoubleTwo;

        System.out.println(myDoubleTwo);    // Output: 15.75
        System.out.println(myIntTwo);       // Output: 15

        // NOTE: Aşağıdaki işlemde output olarak 5.04 değil 5.039999999999999 verir.
        double x = 5.02;
        double y = 0.02;
        double z = x + y;

        System.out.println(z);

        // Bu problemi çözmek adına "BigDecimal" kullanılır. (Genelde parasal işlemlerde tercih edilir)
        String a = "5.02";
        String b = "0.02";
        BigDecimal aa = new BigDecimal(a);
        BigDecimal bb = new BigDecimal(b);

        System.out.println(aa.add(bb));
    }
}
