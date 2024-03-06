package ExtensibilityExample.BadImplementation;

public class HourlyPaymentCalculator implements PaymentCalculator {

    private final double HOURLY_RATE ;

    public HourlyPaymentCalculator(double HOURLY_RATE) {
        this.HOURLY_RATE = HOURLY_RATE;
    }

    @Override
    public double getPay(Client client) {
        return client.getHoursWorked() * this.HOURLY_RATE;
    }
    
}
