package sections.sec99_algorithms_livecoding_practice.oop_scenarios.Interface_StrategyPattern;

/*
    PaymentMethod diye bir interface tanımla: pay(amount) olsun.
    CreditCardPayment ve IbanTransferPayment implement etsin.
    CheckoutService bir PaymentMethod alıp ödeme yapsın.
    Sonra “yeni ödeme yöntemi eklemek” existing code’u mümkün olduğunca bozmadan olsun.

    Interview follow-up (sık gelir):
    Soru: “PaymentMethod seçimini if/else ile mi yapacağız?”
    Cevap: Hayır, genelde Factory ile seçersin veya DI container (Spring) ile injection yaparsın. Spring Boot tarafında @Qualifier kullanılabilir
*/

import java.math.BigDecimal;

interface PaymentMethod {
    String pay(BigDecimal amount);
}

class CreditCardPayment implements PaymentMethod {

    @Override
    public String pay(BigDecimal amount) {
        return "Paid " + amount + " with Credit Card";
    }
}

class IbanTransferPayment implements PaymentMethod {

    @Override
    public String pay(BigDecimal amount) {
        return "Paid " + amount + " with Iban Transfer";
    }
}

class CheckoutService {
    private final PaymentMethod paymentMethod;

    CheckoutService(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    String checkout(BigDecimal amount) {
        return paymentMethod.pay(amount);
    }
}

public class StrategyPayment {
    public static void main(String[] args) {
        CheckoutService checkoutService1 = new CheckoutService(new CreditCardPayment());
        System.out.println(checkoutService1.checkout(new BigDecimal("100.50")));

        CheckoutService checkoutService2 = new CheckoutService(new IbanTransferPayment());
        System.out.println(checkoutService2.checkout(new BigDecimal("150.00")));
    }
}
