package sections.sec32_OOP_Constructors;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Ahmet", 23, 80);
        Human human2 = new Human("Hüseyin", 23, 85);

        System.out.println(human.name);
        System.out.println(human.age);
        System.out.println(human.weight);

        System.out.println(human2.name);

        human.eat();
        human2.drink();

    }
}
