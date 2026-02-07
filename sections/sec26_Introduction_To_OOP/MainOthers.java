package sections.sec26_Introduction_To_OOP;

import java.util.Scanner;

public class MainOthers {
    public static void main(String[] args) {
        // NOTE: Sadece statik metoddan oluşan "Example" adında class oluşturduk. Statik metodları kullanırken obje oluşturmaya gerek yoktur
        Example.sayHello();


        // "Door" Class
        Door door = new Door();
        door.knock();
        door.knock();


        // "Product" Class
        Product product1 = new Product("Banana", 14.30, 1);
        Product product2 = new Product("Berry", 4.5, 2);
        product1.printProduct();
        product2.printProduct();


        // "Debt" Class
        Debt mortgage = new Debt(1200.00F, 1.01F);

        mortgage.printBalance();
        mortgage.waitOneYear();
        mortgage.printBalance();

        int years = 0;

        while (years < 20) {
            mortgage.waitOneYear();
            years++;
        }

        mortgage.printBalance();


        // "Film" Class
        Film film = new Film("Coupling", 18);

        System.out.println(film.printName() + " - " + film.ageRating());

        Scanner scanner = new Scanner(System.in);
        System.out.println("How old are you?");
        int userInput = scanner.nextInt();

        if (userInput < film.ageRating()) {
            System.out.println("You can not watch the " + film.printName());
        } else {
            System.out.println("You can watch the " + film.getName());
        }


        // "Gauge" Class
        Gauge gauge = new Gauge();

        while (!gauge.full()) {
            System.out.println("Not full! Value: " + gauge.printValue());
            gauge.increase();
        }

        System.out.println("Full! Value: " + gauge.printValue());
        gauge.decrease();
        System.out.println("Not full! Value: " + gauge.printValue());


        // "BodyMassIndex" Class
        BodyMassIndex human = new BodyMassIndex("Lebron");
        BodyMassIndex human2 = new BodyMassIndex("Curry");

        human.setHeight(195);
        human.setWeight(94);

        human2.setHeight(188);
        human2.setWeight(83);

        System.out.println(human.getName() + "'s body mass index is " + human.bodyMassIndex());
        System.out.println(human2.getName() + "'s body mass index is " + human2.bodyMassIndex());


        // "Statistics" Class
        Statistics statistics = new Statistics();

        statistics.addNumber(3);
        statistics.addNumber(2);
        statistics.addNumber(5);
        System.out.println("Count: " + statistics.getCount());
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Average: " + statistics.average());


        // "PaymentCard" Class
        PaymentCard paymentCard = new PaymentCard(5);
        System.out.println(paymentCard);

        paymentCard.eatAffordably();
        System.out.println(paymentCard);

        paymentCard.eatHeartily();
        paymentCard.eatAffordably();
        System.out.println(paymentCard);

        paymentCard.setBalance(10.0);
        System.out.println(paymentCard);
        paymentCard.setBalance(25.0);
        System.out.println(paymentCard);
        paymentCard.setBalance(55.0);
        System.out.println(paymentCard);
        paymentCard.setBalance(30.0);
        System.out.println(paymentCard);
        paymentCard.setBalance(35.0);
        System.out.println(paymentCard);
        paymentCard.setBalance(-15);
        System.out.println(paymentCard);
        paymentCard.setBalance(45.0);
        System.out.println(paymentCard);
        paymentCard.setBalance(-32.0);
        System.out.println(paymentCard);
    }
}
