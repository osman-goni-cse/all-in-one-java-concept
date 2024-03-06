package ExtensibilityExample.BadImplementation;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Total Payable amount for DSi");

        PaymentCalculator hourlyPaymentCalculator = new HourlyPaymentCalculator(75);
        PaymentCalculator fixedPaymentCalculator = new FixedPaymentCalculator(509.0);

        HrManager hrManager = new HrManager(hourlyPaymentCalculator);

        Client client1 = new Client("Client_1", 15);
        Client client2 = new Client("Client_2", 91);
        Client client3 = new Client("Client_2", 33);

        hrManager.addClient(client1);
        hrManager.addClient(client3);
        hrManager.addClient(client2);

        System.out.println("DSi spent " + hrManager.getPayableAmount() + " on employees");
    }
}
