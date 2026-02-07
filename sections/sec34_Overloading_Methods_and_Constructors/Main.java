package sections.sec34_Overloading_Methods_and_Constructors;

public class Main {
    public static void main(String[] args) {

        // Constructor Overloading
        Person person1 = new Person("Hüseyin");
        Person person2 = new Person("Safa", 23);

        // NOTE: Parametresiz constructor olmadığı için alttaki satır hata verir. Eğer hiç constructor oluşturulmazsa otomatikman default constructor oluşturulur
        // Person person3 = new Person();

        System.out.println(person1);
        System.out.println(person2);


        // Method Overloading
        Person person3 = new Person("Paul", 24);
        System.out.println(person3);

        person3.growOlder();
        System.out.println(person3);        // Output: 25

        person3.growOlder(10);
        System.out.println(person3);        // Output: 35


        // "Product" Class:
        Product product1 = new Product("Pencil");
        Product product2 = new Product("Desk", "Istanbul");
        Product product3 = new Product("Window", 3);

        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);


        // "Counter" Class:
        Counter counter1 = new Counter();
        Counter counter2 = new Counter(15);

        counter1.increase();
        counter1.increase(5);
        counter1.decrease();
        counter1.decrease(3);

        counter2.increase();
        counter2.increase(5);
        counter2.decrease();
        counter2.decrease(3);

        System.out.println("Counter 1: " + counter1.getValue());
        System.out.println("Counter 2: " + counter2.getValue());
    }
}
