package sections.sec73_unit_test.a_without_dependency_junit;

public class PriceCalculator {
    public static int calculateFinalPrice(int basePrice, int discountPercentage) {
        if (basePrice < 0) {
            throw new IllegalArgumentException("Base price cannot be negative");
        }
        if (discountPercentage < 0 || discountPercentage > 100) {
            throw new IllegalArgumentException("Discount percentage must be between 0 and 100");
        }

        int discountAmount = basePrice * discountPercentage / 100;
        return basePrice - discountAmount;
    }

    public static void main(String[] args) {
        System.out.println(calculateFinalPrice(100, 10));
    }
}
