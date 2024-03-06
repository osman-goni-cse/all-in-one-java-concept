package ShoppingCartSystem;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<AbstractProduct> products = new ArrayList<>();

    public void addProductToCart(AbstractProduct product) {
        products.add(product);
    }

    public int getTotalPriceOfAllTheProducts() {
        int totalPrice = 0;

        for(AbstractProduct product: products) {
            totalPrice += product.calculateFinalProductPrice();
        }

        return totalPrice;
    }

    @Override
    public String toString() {
        return "ShoppingCart [products=" + products + "]";
    }

    
}
