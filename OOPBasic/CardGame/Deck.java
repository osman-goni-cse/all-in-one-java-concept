package OOPBasic.CardGame;

public class Deck {
    private final Card[] cards;
    private int cardsUsed;

    Deck() {
        this.cards = new Card[52];
        initializeDeck();
    }

    public void initializeDeck() {
        int count = 0;

        for(int i = 1; i <= 13; i++) {
            cards[count++] = new Card(i, CardSuit.HEARTS);
        }

        for(int i = 1; i <= 13; i++) {
            cards[count++] = new Card(i, CardSuit.DIAMONDS);
        }

        for(int i = 1; i <= 13; i++) {
            cards[count++] = new Card(i, CardSuit.SPADES);
        }

        for(int i = 1; i <= 13; i++) {
            cards[count++] = new Card(i, CardSuit.CLUBS);
        }
    }

    public void shuffleCard() {
        for(int i = 0; i < cards.length; i++) {
            int random = (int) (Math.random() * (i+1));

            Card temp = cards[i];
            cards[i] = cards[random];
            cards[random] = temp;
        }
        cardsUsed = 0;
    }

    public Card dealCard() {
        if(cardsUsed >= 52) {
            cardsUsed = 0;
        }
        return cards[cardsUsed++];
    }


}
