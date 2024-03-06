package PillarsOfOOP.Abstraction;

public class ShoppingCartDemo {
    public static void main(String[] args) {
        System.out.println("************ Shopping Cart Page ***************");

        ShoppingCart shoppingCart = new ShoppingCart();

        Product keyboard = new Product("Keyboard", 1, 150, 0, new Dimension(1, 4, 2));
        Product mouse = new Product("Mouse", 2, 50, 2, new Dimension(2, 1, 5));
        Product mobile = new Product("Apple A15", 1, 250, 5, new Dimension(1, 1, 5));

        DigitalProduct digitalProduct = new DigitalProduct("eBook: Bela Furabar Age", 45, 0);

        shoppingCart.addProduct(digitalProduct);


        // shoppingCart.addProduct(keyboard);
        // shoppingCart.addProduct(mobile);
        // shoppingCart.addProduct(mouse);

        System.out.println("Total Payable amount is: " + shoppingCart.getTotalPrice());

        System.out.println(shoppingCart);
    }
}
