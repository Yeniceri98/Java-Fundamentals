package sections.sec72_SOLID;

/*
    BAD IMPLEMENTATION:

    class PaymentService {
        public void pay(String type) {
            if ("CARD".equals(type)) {
                System.out.println("Card payment");
            } else if ("PAYPAL".equals(type)) {
                System.out.println("Paypal payment");
            }
        }
    }
*/

interface Payment {
    void pay();
}

class CardPayment implements Payment {
    public void pay() {
        System.out.println("Card payment");
    }
}

class PaypalPayment implements Payment {
    public void pay() {
        System.out.println("Paypal payment");
    }
}

class PaymentService {
    public void process(Payment payment) {
        payment.pay();
    }
}

public class OpenClosed {
    public static void main(String[] args) {
        PaymentService paymentService1 = new PaymentService();
        paymentService1.process(new CardPayment());     // Card payment

        PaymentService paymentService2 = new PaymentService();
        paymentService2.process(new PaypalPayment());   // Paypal payment
    }
}

// Class’lar gelişime açık, değişime kapalı olmalıdır