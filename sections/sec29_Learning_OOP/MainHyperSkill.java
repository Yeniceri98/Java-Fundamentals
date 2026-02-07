package sections.sec29_Learning_OOP;

import java.util.Scanner;

public class MainHyperSkill {
    public static void main(String[] args) {
        GettersSettersHyperskill tim = new GettersSettersHyperskill();
        tim.setFirstName("     ahmet");
        tim.setLastName("");
        System.out.println(tim.getFullName()); // Tim Towler

        GettersSettersHyperskill katie = new GettersSettersHyperskill();
        katie.setFirstName("Katie");
        katie.setLastName(null);
        System.out.println(katie.getFullName()); // Katie (without additional spaces)

        Scanner scanner = new Scanner(System.in);
        String first, last;
        int isContinue = 1;

        while (isContinue != 0) {
            System.out.print("First: ");
            first = scanner.nextLine();
            System.out.print("Last: ");
            last = scanner.nextLine();

            String fullName = first + " " + last;
            String trimmedFullName = (first + " " + last).trim();
            System.out.println("Not trimmed: " + fullName);
            System.out.println("Trimmed: " + trimmedFullName);

            System.out.print("Continue? ");
            isContinue = scanner.nextInt();
        }
    }
}
