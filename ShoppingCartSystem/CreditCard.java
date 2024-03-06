package ShoppingCartSystem;

public class CreditCard {
    private long number;
    private int cvv;
    String validUntill;

    public CreditCard(long number, int cvv, String validUntill) {
        this.number = number;
        this.cvv = cvv;
        this.validUntill = validUntill;
    }

    @Override
    public String toString() {
        return "CreditCard [number=" + number + ", cvv=" + cvv + ", validUntill=" + validUntill + "]";
    }

    
}
