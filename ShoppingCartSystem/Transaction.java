package ShoppingCartSystem;

import java.time.LocalDateTime;
import java.util.UUID;

public class Transaction {
    private final UUID transactionID;
    private final int amount;
    private final LocalDateTime creationTime;

    public Transaction(UUID transactionId, int amount) {
        this.transactionID = transactionId;
        this.amount = amount;
        this.creationTime = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Transaction [transactionID=" + transactionID + ", amount=" + amount + ", creationTime=" + creationTime
                + "]";
    }

    
}
