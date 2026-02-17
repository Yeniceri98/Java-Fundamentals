import org.junit.jupiter.api.Test;
import sections.sec73_unit_test.a_without_dependency_junit.PriceCalculator;

import static org.junit.jupiter.api.Assertions.*;

class PriceCalculatorTest {

    @Test
    void calculateFinalPrice_whenValidInput_returnsDiscountedPrice() {
        int result = PriceCalculator.calculateFinalPrice(100, 10);
        assertEquals(90, result);
    }

    @Test
    void calculateFinalPrice_whenDiscountIsZero_returnsBasePrice() {
        int result = PriceCalculator.calculateFinalPrice(100, 0);
        assertEquals(100, result);
    }

    @Test
    void calculateFinalPrice_whenBasePriceIsNegative_throwsException() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> PriceCalculator.calculateFinalPrice(-1, 10)
        );
        assertEquals("Base price cannot be negative", exception.getMessage());
    }

//    //@Test
//    void calculateFinalPrice_whenDiscountIsOutOfRange_throwsException() {
//        assertAll(
//                () -> assertThrows(
//                        IllegalArgumentException.class,
//                        () -> PriceCalculator.calculateFinalPrice(100, -1)
//                ),
//                () -> assertThrows(
//                        IllegalArgumentException.class,
//                        () -> PriceCalculator.calculateFinalPrice(100, 101)
//                )
//        );
//    }

}