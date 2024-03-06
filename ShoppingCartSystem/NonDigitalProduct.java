package ShoppingCartSystem;

import PillarsOfOOP.Abstraction.Dimension;

public class NonDigitalProduct extends AbstractProduct{

    private static final double SHIPPING_RATE = 3.5;
    private static final double DIMENSION_CHARGE = 1.5;

    private Dimension productDimension;
    private double productWeight;

    public NonDigitalProduct(String productName, int productPrice, int productDiscount, double productWeight, Dimension productDimension) {
        super(productName, productPrice, productDiscount);
        this.productWeight = productWeight;
        this.productDimension = productDimension;
    }

    @Override
    public int calculateFinalProductPrice() {
        int price = getProductPrice() * ((100 - getProductDiscount()) / 100);
        price += this.productWeight * SHIPPING_RATE;

        if(this.productDimension.getVolume() > 10) {
            price += productDimension.getVolume() * DIMENSION_CHARGE;
        }
        return price;
    }

    @Override
    public String toString() {
        return "NonDigitalProduct [productDimension=" + productDimension + ", productWeight=" + productWeight + "]";
    }

    
}
