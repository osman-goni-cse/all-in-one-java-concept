package PillarsOfOOP.Abstraction;

public class DigitalProduct extends Product{

    public DigitalProduct(String productName, int productPrice, int productDiscount) {
        super(productName, 0, productPrice, productDiscount, new Dimension(0, 0, 0));
    }
    
}
