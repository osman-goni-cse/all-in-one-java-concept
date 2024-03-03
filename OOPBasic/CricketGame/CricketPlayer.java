package OOPBasic.CricketGame;

public class CricketPlayer {
    private String name;
    private int score;
    private static int totalScore;

    public CricketPlayer(String name) {
        this.name = name;
    }

    public void addScore(int score) {
        this.score += score;
        totalScore += score;
    }

    public static void showTotalScore() {
        System.out.println("Total Score: " + totalScore);
    }

    @Override
    public String toString() {
        return this.name + ": " +this.score;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Cricket Game");

        CricketPlayer tamim = new CricketPlayer("Tamim Iqbal");
        CricketPlayer sakib = new CricketPlayer("Sakib");
        CricketPlayer riyad = new CricketPlayer("Riyad");

        tamim.addScore(98);
        sakib.addScore(87);
        riyad.addScore(15);
        sakib.addScore(19);
        tamim.addScore(53);
        riyad.addScore(29);

        System.out.println(tamim);
        System.out.println(sakib);
        System.out.println(riyad);
        CricketPlayer.showTotalScore();

    }

}
