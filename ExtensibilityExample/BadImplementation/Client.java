package ExtensibilityExample.BadImplementation;

public class Client {
    private String clientName;
    private double hoursWorked;

    public Client(String clientName, double hoursWorked) {
        this.clientName = clientName;
        this.hoursWorked = hoursWorked;
    }

    public String getClientName() {
        return clientName;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }
}
