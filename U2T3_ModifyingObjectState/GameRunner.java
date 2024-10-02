public class GameRunner {
    public static void main(String[] args) {
        Game game = new Game("Monopoly", 7);
        System.out.println("Game name: " + game.getGameName());
        System.out.println("Players: " + game.getPlayers());
        System.out.println("Score: " + game.getScore());
        System.out.println("Is game over? " + game.isGameOver());
        game.changeGame();
        System.out.println("Game name: " + game.getGameName());
        game.lostPlayer();
        System.out.println("Players: " + game.getPlayers());
        game.lostPlayer();
        System.out.println("Players: " + game.getPlayers());
        game.addPlayer();
        System.out.println("Players: " + game.getPlayers());
        game.lostPlayer();
        game.lostPlayer();
        game.increaseScore(8);
        System.out.println("Score: " + game.getScore());
        game.decreaseScore(4);
        System.out.println("Score: " + game.getScore());
        game.increaseScore(12);
        System.out.println("Score: " + game.getScore());
        game.decreaseScore(6);
        System.out.println("Game name: " + game.getGameName());
        System.out.println("Players: " + game.getPlayers());
        System.out.println("Score: " + game.getScore());
        System.out.println("Avg score per player: " + game.averageScorePerPlayer());
        System.out.println("Is game over? " + game.isGameOver());
    }
}