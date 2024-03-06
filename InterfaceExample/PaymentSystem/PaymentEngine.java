package InterfaceExample.PaymentSystem;

public class PaymentEngine {
    public void acceptPaymentMethod(Payment payment) {
        System.out.println("Accepting Payment: " + payment.getAmount());
    }
}
