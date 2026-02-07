package sections.sec26_Introduction_To_OOP;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void printProduct() {
        System.out.println("\nName of the product: " + this.name);
        System.out.println("Price of the product: " + this.price);
        System.out.println("Quantity of the product: " + this.quantity);
    }
}
