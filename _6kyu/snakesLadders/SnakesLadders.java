package _6kyu.snakesLadders;

import java.util.HashMap;
import java.util.Map;
public class SnakesLadders {

    public static void main(String[] args) {
        SnakesLadders game = new SnakesLadders();

        // Example moves:
        System.out.println(game.play(1, 1)); // Player 1 plays
        System.out.println(game.play(1, 5)); // Player 1 rolled doubles? No → Player 2 plays
        System.out.println(game.play(6, 2)); // Player 2 plays
        System.out.println(game.play(3, 3)); // Player 1 plays again because of doubles
        System.out.println(game.play(4, 4)); // Another double
        System.out.println(game.play(2, 3)); // Normal turn

    }
    int positionPlayer1 ;
    int positionPlayer2 ;
    int currentPlayer ;
    boolean gameOver ;
    public SnakesLadders() {

        positionPlayer1 = 0 ;
        positionPlayer2 = 0;
        currentPlayer = 1;
        gameOver = false;
}
    public String play(int die1, int die2) {
        boolean diesTruck = (die1 < 0 || die1 > 6 ) || (die2 < 0 || die2 > 6  );
        if (diesTruck){
            return "Dies truck";
        }
        if (gameOver) {
            return "Game over!";
        }
        Map<Integer,Integer> snakeLadders = new HashMap<>();
        snakeLadders.put(2,38);
        snakeLadders.put(7,14);
        snakeLadders.put(8,31);
        snakeLadders.put(15,26);
        snakeLadders.put(21,42);
        snakeLadders.put(28,84);
        snakeLadders.put(36,44);
        snakeLadders.put(51,67);
        snakeLadders.put(71,91);
        snakeLadders.put(78,98);
        snakeLadders.put(87,94);
        snakeLadders.put(16,6);
        snakeLadders.put(46,25);
        snakeLadders.put(49,11);
        snakeLadders.put(62,19);
        snakeLadders.put(64,60);
        snakeLadders.put(74,53);
        snakeLadders.put(89,68);
        snakeLadders.put(92,88);
        snakeLadders.put(95,75);
        snakeLadders.put(99,80);

        int rollSum = die1 + die2;
        int positionCurrPlayer;

        // Move current player
        if (currentPlayer == 1){
            positionCurrPlayer = positionPlayer1 + rollSum;
            if (positionCurrPlayer > 100){
                positionCurrPlayer = 100 - (positionCurrPlayer - 100);

            }
            //Move if snake or ladder
            if (snakeLadders.containsKey(positionCurrPlayer)){
                positionCurrPlayer = snakeLadders.get(positionCurrPlayer);

            }
            positionPlayer1 = positionCurrPlayer;
        }else {
            positionCurrPlayer = positionPlayer2 + rollSum;
            if (positionCurrPlayer > 100){
                positionCurrPlayer = 100 - (positionCurrPlayer - 100);

            }
            if (snakeLadders.containsKey(positionCurrPlayer)){
                positionCurrPlayer = snakeLadders.get(positionCurrPlayer);
            }
            positionPlayer2 = positionCurrPlayer;
        }
        //check for win condition
        if (positionCurrPlayer == 100){
            gameOver = true;
            return "Player "+ currentPlayer +" Wins!";
        }
        //handle overshooting
        String result =  "Player " + currentPlayer + " is on square " + positionCurrPlayer;
        //handle doubles
        if (die1 != die2){
            currentPlayer = (currentPlayer == 1) ? 2 : 1;
        }

        return result;
    }
}