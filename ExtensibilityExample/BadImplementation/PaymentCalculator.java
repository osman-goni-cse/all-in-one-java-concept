package ExtensibilityExample.BadImplementation;

public class PaymentCalculator {
    private static final double HOURLY_RATE = 75;
    private static final double FIXED_RATE = 550;

    public double getPay(Client client, String paymentMethod) {
        switch (paymentMethod) {
            case "HOURLY":
                return client.getHoursWorked() * HOURLY_RATE;
            case "FIXED":
                return FIXED_RATE;
            default:
                return 0.0;
        }
    }
}
