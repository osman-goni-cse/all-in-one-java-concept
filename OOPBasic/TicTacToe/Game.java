package OOPBasic.TicTacToe;

import java.util.Arrays;
import java.util.Scanner;

public class Game {
    private static final char FIRST_PLAYER_SYMBOL = 'X';
    private static final char SECOND_PLAYER_SYMBOL = 'O';
    private static final char EMPTY_BOX = ' ';
    private String FIRST_PLAYER_NAME;
    private String SECOND_PLAYER_NAME;
    private String whoWonTheGame;
    private int row, col;


    private final char[][] board = new char[3][3];

    private int whoPlayedFirst;
    private int currentPlayer;

    Scanner scanner = new Scanner(System.in);

    public void startGame() {
        initializeBoard();

        askPlayerDetails();
        while (!isGameOver()) {
            showBoardState();
            showPlayerTurn();
            takeInput();
        } 
        System.out.println("Game Ends");
    }

    public void initializeBoard() {
        for(char[] chars: board) {
            Arrays.fill(chars, EMPTY_BOX);
        }
    }

    public void askPlayerDetails() {
        System.out.println("What's your name?");
        FIRST_PLAYER_NAME = scanner.nextLine();
        System.out.println("Who are you playing with?");
        SECOND_PLAYER_NAME = scanner.nextLine();

        System.out.println("Who is playing first? press");
        System.out.printf("1 for %s\n2 for %s%n", FIRST_PLAYER_NAME, SECOND_PLAYER_NAME);

        whoPlayedFirst = scanner.nextInt();
        currentPlayer = whoPlayedFirst;
    }

    public void showBoardState() {
        System.out.println("|---|---|---|---|");

        for(char[] chars: board) {
            System.out.printf("| %c | %c | %c |\n", chars[0], chars[1], chars[2]);
            System.out.println("|---|---|---|---|");
        }
    }

    public void showPlayerTurn() {
        if(currentPlayer == 1) {
            System.out.printf("%s's Turn\n", FIRST_PLAYER_NAME);
        }
        else {
            System.out.printf("%s's Turn\n", SECOND_PLAYER_NAME);
        }
    }

    public boolean isBoardFull() {
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j<3; j++) {
                if(board[i][j] == EMPTY_BOX) {
                    return false;
                }
            }
        }
        System.out.println("The Result is  Draw");
        return true;
    }

    public boolean isGameOver() {
        // Row check
        char cross = ' ';
        for(char[] chars: board) {
            if(chars[0] == chars[1] && chars[1] == chars[2]) {
                cross = chars[0];
            }
        }
        // Column Check
        for(int i = 0; i < 3; i++) {
            if(board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
                cross = board[i][0];
            }
        }
        // Diagonal Check

        if(board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            cross = board[0][0];
        }

        if(board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            cross = board[0][2];
        }
        if(cross == ' ') {
            return isBoardFull();
        }
        else {
            if(cross == FIRST_PLAYER_SYMBOL) {
                whoWonTheGame =  whoPlayedFirst == 1?FIRST_PLAYER_NAME:SECOND_PLAYER_NAME;
            }
            else {
                whoWonTheGame =  whoPlayedFirst == 1?SECOND_PLAYER_NAME:FIRST_PLAYER_NAME;
            }
            System.out.println("Game Over");
            System.out.printf("%s won the game, Congratulation!\n", whoWonTheGame);
            return true;
        }
    }
    
    public void takeInput() {
        do {
            System.out.println("Enter a row number(0, 1, 2)");
            row = scanner.nextInt();
            System.out.println("Enter a column number(0, 1, 2)");
            col = scanner.nextInt();
            
            if(isValidMove(row, col)) {
                if(board[row][col] != EMPTY_BOX) {
                    System.out.println("Your Opposition already made a move at this position, choose another box");
                }
                else {
                    board[row][col] = currentPlayer == whoPlayedFirst?FIRST_PLAYER_SYMBOL:SECOND_PLAYER_SYMBOL;
                    currentPlayer = currentPlayer == 1?2:1;
                }
            }
            else {
                System.out.println("Your Move is not valid");
            }
        }while(!isValidMove(row, col));
    }

    public boolean isValidMove(int row, int col) {
        return row < 3 && row >=0 && col < 3 && col >=0;
    }
}
