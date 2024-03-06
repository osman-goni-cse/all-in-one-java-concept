package InterfaceExample.PaymentSystem;

public class PaymentDemo {
    public static void main(String[] args) {
        System.out.println("Integrated Payment System.....");
        PaymentEngine paymentEngine = new PaymentEngine();

        CellfinPayment cellfinPayment = new CellfinPayment(159);
        CashPayment cashPayment = new CashPayment(999);

        paymentEngine.acceptPaymentMethod(cellfinPayment);
        paymentEngine.acceptPaymentMethod(cashPayment);

    }
}
