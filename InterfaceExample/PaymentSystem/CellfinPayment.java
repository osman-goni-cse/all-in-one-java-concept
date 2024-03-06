package InterfaceExample.PaymentSystem;

public class CellfinPayment implements Payment{
    private double amount;

    public CellfinPayment(double amount) {
        this.amount = amount;
    }

    @Override
    public double getAmount() {
        System.out.println("Taking Cellfin Payment");
        return amount;
    }
}
