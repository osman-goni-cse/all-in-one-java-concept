package InterfaceExample.PaymentSystem;

public class CashPayment implements Payment{
    private double amount;

    public CashPayment(double amount) {
        this.amount = amount;
    }

    @Override
    public double getAmount() {
        System.out.println("Taking Cash On Delivery..");
        return amount;
    }
}
