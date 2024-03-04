package OOPBasic.CardGame;

import java.util.Scanner;

public class HighLowGuess {

    private final Scanner input = new Scanner(System.in);
    private int correctGuesses;

    public void play() {
        int gamesPlayed = 0;
        boolean playAgain;
        do {
            playUntilIncorrectGuesses();
            gamesPlayed++;
            playAgain = askUserToPlayAgain();
        }while(playAgain);

        System.out.printf("You Played %d Games, Your Avg Score is: %1.3f\n", gamesPlayed, (double) correctGuesses/gamesPlayed);
    }

    public void playUntilIncorrectGuesses() {
        Deck deck = new Deck();
        deck.shuffleCard();

        Card card = deck.dealCard();

        System.out.println("The first card is: " + card);

        boolean keepPlaying = true;

        while(keepPlaying) {
            System.out.print("Will the next card be higher(H) or Lower(L):");
            char ch = input.next().charAt(0);
            Card nextCard = deck.dealCard();
            System.out.println("The next card is: " + nextCard);

            if(ch == 'L') {
                if(card.getCardValue() > nextCard.getCardValue()) {
                    correctGuesses++;
                    System.out.println("Your guess was correct.");
                }
                else {
                    System.out.println("Wrong guess..Out of the game");
                    keepPlaying = false;
                }
            }
            else if(ch == 'H') {
                if(card.getCardValue() < nextCard.getCardValue()) {
                    correctGuesses++;
                    System.out.println("Your guess was correct.");
                }
                else {
                    System.out.println("Wrong guesss... Out of the game.");
                    keepPlaying = false;
                }
            }
            else {
                System.out.println("Invalid response.Please type only L or H");
            }
            card = nextCard;
            System.out.println("The card is: " + card);
        }
        
    }

    public boolean askUserToPlayAgain() {
        System.out.print("Want to Play again? if, Please type YES otherwise type anything to exit:");
        String str = input.nextLine();
        return input.nextLine().toUpperCase().contains("YES");
    }

    public static void main(String[] args) {
        System.out.println("################ High Low Card Guessing Game ######################");
        HighLowGuess game = new HighLowGuess();

        game.play();
    }
}
