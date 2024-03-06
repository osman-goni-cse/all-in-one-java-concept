package ShoppingCartSystem;

import java.util.UUID;

public class Customer {
    private String customerName;
    private CreditCard creditCard;

    public Customer(String customerName, CreditCard creditCard) {
        this.customerName = customerName;
        this.creditCard = creditCard;
    }

    public Customer(String customerName, long number, int cvv, String validUntill) {
        this.customerName = customerName;
        this.creditCard = new CreditCard(number, cvv, validUntill);
    }

    public Order checkout(ShoppingCart shoppingCart) {
        Transaction transaction = makePayment(shoppingCart);
        return new Order(this, transaction, shoppingCart);
    }

    public Transaction makePayment(ShoppingCart cart) {
        return new Transaction(UUID.randomUUID(), cart.getTotalPriceOfAllTheProducts());
    }
}
