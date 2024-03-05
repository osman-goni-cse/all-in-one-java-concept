package ExtensibilityExample.BadImplementation;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Total Payable amount for DSi");

        HrManager hrManager = new HrManager();

        Client client1 = new Client("Client_1", 15);
        Client client2 = new Client("Client_2", 91);
        Client client3 = new Client("Client_2", 33);

        hrManager.addClient(client1);
        hrManager.addClient(client3);
        hrManager.addClient(client2);

        System.out.println("DSi spent " + hrManager.getPayableAmount("FIXED") + " on employees");
    }
}
