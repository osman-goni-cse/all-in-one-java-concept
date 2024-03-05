package ExtensibilityExample.BadImplementation;

import java.util.ArrayList;
import java.util.List;

public class HrManager {
    private List<Client> clients;
    private PaymentCalculator paymentCalculator;

    public HrManager() {
        this.clients = new ArrayList<>();
        this.paymentCalculator = new PaymentCalculator();
    }

    public void addClient(Client client) {
        clients.add(client);
    }

    public double getPayableAmount(String paymentMethod) {
        double totalAmountToPay = 0.0;
        for(Client client: clients) {
            totalAmountToPay += paymentCalculator.getPay(client, paymentMethod);
        }
        return totalAmountToPay;
    }
}
