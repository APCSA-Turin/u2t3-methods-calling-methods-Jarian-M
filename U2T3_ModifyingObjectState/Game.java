import java.util.Scanner;

public class Game {
    private String gameName;
    private int players;
    private int score;

    Scanner scan = new Scanner(System.in);
    public Game(String gameName, int players) {
    this.gameName = gameName;
    this.players = players;
    score = 0;
    }

    public String getGameName() {
        return gameName;
    }

    public int getPlayers() {
        return players;
    }

    public int getScore() {
        return score;
    }

    public void addPlayer() {
        players ++;
    }

    // new method //
    public void lostPlayer() {
        players --;
    }

    // new method //
    public void changeGame() {
        System.out.print("Want to choose a new game? If so, type the name of the game! Otherwise, write 'no' in lowercase! Enter here: ");
        String newName = scan.nextLine();
        if(!newName.equals("no")) {
            gameName = newName;
        }
    }

    public void increaseScore(int increase) {
        score += increase;
    }

    // new method //
    public void decreaseScore(int decrease) {
        score -= decrease;
    }

    public double averageScorePerPlayer() {
        return (double)score/players;
    }
    public boolean isGameOver(){
        if(score > 9) {
            return true;
        } else {
            return false;
        }
    }
} 