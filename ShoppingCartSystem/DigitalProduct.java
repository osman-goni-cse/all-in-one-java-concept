package ShoppingCartSystem;

public class DigitalProduct extends AbstractProduct{

    public DigitalProduct(String productname, int productPrice, int productDiscount) {
        super(productname, productPrice, productDiscount);
    }

    @Override
    public int calculateFinalProductPrice() {
        return this.getProductPrice() * (100-this.getProductDiscount() / 100);
    }

    @Override
    public String toString() {
        return "DigitalProduct[Name = " + this.getProductName() + " Price = " + this.getProductPrice() + " Discount = " + this.getProductDiscount();
    }

}
