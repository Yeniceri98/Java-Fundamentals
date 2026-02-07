package sections.sec35_Overloaded_Constructors;

public class Main {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza("Turkish Pizza");
        Pizza pizza2 = new Pizza("Fungi Pizza", "Big", 30);

        System.out.println(pizza1.name);

        System.out.println(pizza2.name);
        System.out.println(pizza2.size);
        System.out.println(pizza2.degree);
    }
}
