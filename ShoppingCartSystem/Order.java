package ShoppingCartSystem;

public class Order {
    private Customer customer;
    private Transaction transaction;
    private ShoppingCart shoppingCart;
    
    public Order(Customer customer, Transaction transaction, ShoppingCart shoppingCart) {
        this.customer = customer;
        this.transaction = transaction;
        this.shoppingCart = shoppingCart;
    }

    @Override
    public String toString() {
        return "Order [customer=" + customer + ", transaction=" + transaction + ", shoppingCart=" + shoppingCart + "]";
    }

}
