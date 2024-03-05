package ExtensibilityExample.BadImplementation;

import java.util.ArrayList;
import java.util.List;

public class HrManager {
    private List<Client> clients;
    private PaymentCalculator paymentCalculator;

    public HrManager(PaymentCalculator paymentCalculator) {
        this.clients = new ArrayList<>();
        this.paymentCalculator = paymentCalculator;
    }

    public void addClient(Client client) {
        clients.add(client);
    }

    public double getPayableAmount() {
        double totalAmountToPay = 0.0;
        for(Client client: clients) {
            totalAmountToPay += paymentCalculator.getPay(client);
        }
        return totalAmountToPay;
    }
}
