package sections.sec12_Switch_Statement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner days = new Scanner(System.in);
        System.out.println("Please enter a number between 1 to 7");
        int day = days.nextInt();

        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekdays");
                break;
            case 6:
            case 7:
                System.out.println("Weekends");
                break;
            default:
                System.out.println("Wrong day number!!!");
        }
    }
}
