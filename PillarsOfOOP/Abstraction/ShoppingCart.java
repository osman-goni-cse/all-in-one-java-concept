package PillarsOfOOP.Abstraction;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public int getTotalPrice() {
        int total = 0;
        for(Product product: products) {
            total += product.getProductPrice();
        }
        return total;
    }

    @Override
    public String toString() {
        return "ShoppingCart [products=" + products + "]";
    }

    
}
