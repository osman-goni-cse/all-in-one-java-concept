package OOPBasic.CardGame;


public enum CardSuit {

    HEARTS(1), DIAMONDS(2), SPADES(3), CLUBS(4);
    private final int value;

    CardSuit(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return name() + " ";
    }
}

class Card {
    private final int cardValue;
    private final CardSuit suit;

    Card(int cardValue, CardSuit suit) {
        this.cardValue = cardValue;
        this.suit = suit;
    }

    public int getCardValue() {
        return cardValue;
    }

    public CardSuit getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return getSuit() + "" + getValueAsString();
    }

    public String getValueAsString() {
        switch (cardValue) {
            case 1:
                return "Ace";
            case 2: 
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                return String.valueOf(cardValue);
            case 11:
                return "Jack";
            case 12:
                return "Queen";
            case 13:
                return "King";
            default:
                return "Invalid Card";

        }
    }
}
