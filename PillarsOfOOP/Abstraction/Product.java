package PillarsOfOOP.Abstraction;

public class Product {

    private final String productName;
    private final int productWeight;
    private Dimension productDimension;
    private int productPrice;
    private int productDiscount;
    

    public Product(String productName, int productWeight, int productPrice, int productDiscount, Dimension productDimension) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productWeight = productWeight;
        this.productDiscount = productDiscount;
        this.productDimension = productDimension;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    @Override
    public String toString() {
        return "Product [productName=" + productName + ", productWeight=" + productWeight + ", productDimension="
                + productDimension + ", productPrice=" + productPrice + ", productDiscount=" + productDiscount + "]";
    }

    public int getProductWeight() {
        return productWeight;
    }

    public Dimension getProductDimension() {
        return productDimension;
    }

    public int getProductDiscount() {
        return productDiscount;
    }
}
