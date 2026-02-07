package sections.sec54_Exception_Handling;

/*
    In order to create a custom exception, we need to extend the "Exception" class or "RuntimeException" class
    Exception: Checked
    RuntimeException: Unchecked

    Checked exception'da try-catch veya throws'dan biri kullanılmak zorundadır
*/

class InvalidAgeException extends Exception {
    public InvalidAgeException(String str) {
        super(str);
    }
}

class DivideByZeroException extends RuntimeException {
    public DivideByZeroException(String s) {
        super(s);
    }
}

public class CustomException {
    public static void main(String[] args) {
        try {
            validate(12);
            divide(10, 0);
        } catch (InvalidAgeException ex) {
            System.out.println("Exception occurred: " + ex);
        } catch (DivideByZeroException ex) {
            System.out.println("Caught Exception: " + ex.getMessage());
        }

        System.out.println("rest of the code...");
    }

    static void validate(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age is not valid to vote");
        }
        else {
            System.out.println("welcome to vote");
        }
    }

    public static void divide(int a, int b) {
        if (b == 0) {
            throw new DivideByZeroException("Division by zero is not allowed.");
        }
        System.out.println("Result: " + (a / b));
    }
}
