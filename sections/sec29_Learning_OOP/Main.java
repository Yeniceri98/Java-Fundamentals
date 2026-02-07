package sections.sec29_Learning_OOP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Book Class
        Book book = new Book("J.K. Rowling", "Harry Potter", 220);
        System.out.println(book);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        System.out.print("Weight: ");
        int weight = scanner.nextInt();
        System.out.print("Height: ");
        int height = scanner.nextInt();

        // Person Class
        Person person = new Person(name, age, weight, height);
        System.out.println(person);
    }
}
