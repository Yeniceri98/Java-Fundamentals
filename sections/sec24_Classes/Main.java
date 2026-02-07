package sections.sec24_Classes;

public class Main {
    public static void main(String[] args) {
        Lens lensOne = new Lens("Sony", "85mm", true, 140.50F);         // Creating object
        Lens lensTwo = new Lens("Sony", "120mm", false, 250.99F);
        Lens lensThree = new Lens("Canon", "180mm", true, 450.65F);

        System.out.println("Lens 1");
        System.out.println(lensOne.brand);
        System.out.println(lensOne.focalLength);
        System.out.println(lensOne.isPrime);
        System.out.println("$" + lensOne.price);
        System.out.println();

        System.out.println("Lens 2");
        System.out.println(lensTwo.brand);
        System.out.println(lensTwo.focalLength);
        System.out.println(lensTwo.isPrime);
        System.out.println("$" + lensTwo.price);
        System.out.println();

        System.out.println("Lens 3");
        System.out.println(lensThree.brand);
        System.out.println(lensThree.focalLength);
        System.out.println(lensThree.isPrime);
        System.out.println("$" + lensThree.price);
    }

    static class Lens {         // NOTE: Class ismi büyük harfle başlamalıdır
        String brand;
        String focalLength;
        boolean isPrime;
        float price;

        Lens(String brand, String focalLength, boolean isPrime, float price) {       // Constructor
            this.brand = brand;
            this.focalLength = focalLength;
            this.isPrime = isPrime;
            this.price = price;
        }
    }
}
