package PillarsOfOOP.Encapsulation.Exercise_3;

public class Product {
    private String productName;
    private double productCost;

    public Product(String productName, double productCost) {
        this.setProductName(productName);
        this.setProductCost(productCost);
    }

    private void setProductName(String productName) {
        if(productName.trim().length() <= 0) {
            throw new IllegalArgumentException("Product Name cannot be empty.");
        }
        this.productName = productName;
    }

    private void setProductCost(double productCost) {
        if(productCost < 0) {
            throw new IllegalArgumentException("Product cost can't be negative.");
        }
        this.productCost = productCost;
    }

    public double getProductCost() {
        return productCost;
    }

    public String getProductName() {
        return productName;
    }
}
