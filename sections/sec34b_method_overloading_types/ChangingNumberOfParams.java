package sections.sec34b_method_overloading_types;

class Product {
    public int multiply(int a, int b) {
        return a * b;
    }

    public int multiply(int a, int b, int c) {
        return a * b * c;
    }
}
public class ChangingNumberOfParams {
    public static void main(String[] args) {
        Product product = new Product();
        System.out.println(product.multiply(10, 20));
        System.out.println(product.multiply(10, 20, 30));
    }
}
