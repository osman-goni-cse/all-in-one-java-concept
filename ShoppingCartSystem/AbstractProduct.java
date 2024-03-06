package ShoppingCartSystem;

public abstract class AbstractProduct {
    private String productName;
    private int productPrice;
    private int productDiscount;

    public AbstractProduct(String productName, int productPrice, int productDiscount) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productDiscount = productDiscount;
    }

    public abstract int calculateFinalProductPrice();

    public String getProductName() {
        return productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public int getProductDiscount() {
        return productDiscount;
    }
}
