package ExtensibilityExample.BadImplementation;

public class FixedPaymentCalculator implements PaymentCalculator{
    private double FIXED_RATE = 550.0;

    public FixedPaymentCalculator(double FIXED_RATE) {
        this.FIXED_RATE = FIXED_RATE;
    }

    @Override
    public double getPay(Client client) {
        return FIXED_RATE;
    }
}
