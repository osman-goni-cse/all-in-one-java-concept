package PillarsOfOOP.Abstraction;

public class Product {

    private static final double SHIPPING_RATE = 40;
    private static final double DIMENSION_CHARGE = 3.0;

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
        double calculatePrice = 0.0;
        if(productDimension.getVolume() > 5) {
            calculatePrice += productDimension.getVolume() * DIMENSION_CHARGE;
        }
        calculatePrice += productPrice ;
        calculatePrice += this.getProductWeight() * SHIPPING_RATE;
        calculatePrice -= (productPrice * (productDiscount) / 100.0);

        return calculatePrice;
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
