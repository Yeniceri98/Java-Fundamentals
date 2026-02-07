package sections.sec5_Comparison_Logical_Operators;

public class Main {
    public static void main(String[] args) {
        int num = 10;
        int num2 = 15;
        boolean comparison = num > num2;

        System.out.println(comparison);     // Output: False
        System.out.println(30 < 150);       // Output: True
        System.out.println(30 == 15);
        System.out.println(30 != 15);


        // ___ LOGICAL OPERATORS ___
        boolean isAdult = false;
        boolean isStudent = true;
        boolean isMember = false;

        System.out.println(isAdult == false && isStudent == true);      // Output: True
        System.out.println(isAdult == false && isStudent == false);     // Output: False
        System.out.println(isAdult == false || isStudent == false);     // Output: True
        System.out.println(isAdult && isStudent);                       // Output: False
        System.out.println(isAdult || isStudent);                       // Output: True
        System.out.println((isAdult || isStudent) && isMember);         // Output: False

    }
}
