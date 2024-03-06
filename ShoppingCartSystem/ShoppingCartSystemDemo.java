package ShoppingCartSystem;

import PillarsOfOOP.Abstraction.Dimension;

public class ShoppingCartSystemDemo {
    public static void main(String[] args) {
        System.out.println("******** Welcome To grammerCommerz Store *************");

        NonDigitalProduct keyboard = new NonDigitalProduct("Keyboard", 1, 150, 0, new Dimension(1, 4, 2));
        NonDigitalProduct mouse = new NonDigitalProduct("Mouse", 2, 50, 2, new Dimension(2, 1, 5));
        NonDigitalProduct mobile = new NonDigitalProduct("Apple A15", 1, 250, 5, new Dimension(1, 1, 5));

        DigitalProduct eBook = new DigitalProduct("eBook: Bela Furabar Age", 45, 0);
        DigitalProduct course = new DigitalProduct("JavaPro", 1500, 7);

        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.addProductToCart(keyboard);
        shoppingCart.addProductToCart(mouse);
        shoppingCart.addProductToCart(mobile);
        shoppingCart.addProductToCart(eBook);
        shoppingCart.addProductToCart(course);

        Customer osman = new Customer("Osman Goni", 10102056L, 951, "02/25");

        Order order = osman.checkout(shoppingCart);
        System.out.println("Card Items: " + shoppingCart);
        System.out.println("Total Amount to pay: " + shoppingCart.getTotalPriceOfAllTheProducts());
        System.out.println(order);
    }
}
