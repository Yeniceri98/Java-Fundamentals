package sections.sec11_If_Else_Statement;

public class Main {
    public static void main(String[] args) {
        int age = 16;

        if (age >= 18) {
            System.out.println("Adult");
        } else if (age >= 16 && age < 18) {
            System.out.println("Almost adult but not yet");
        } else {
            System.out.println("Not adult");
        }

        // TERNARY OPERATOR
        int ageTwo = 17;
        String message = ageTwo >= 18 ? "Adult" : "Not adult";
        System.out.println(message);
    }
}
