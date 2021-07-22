package ru.skillbench.tasks.basics.practical2;

/**
 * todo Document type Game
 */

public class Game implements Gameable{

    @Override
    public void playGame(int N, int K){
        Player[] players = new Player[N];
        players[0] = new Player();
        players[0].setName("You");
        players[N-1] = new Player();
        players[N-1].setName("Computer");
        for(int i = 1; i < (players.length-1); i++){ //name other players
            players[i] = new Player();
            players[i].setName("Player "+i);
        }
        int k = 0;
        while(isWinner(players)==false) {
            System.out.println("\nRound №" + (k+1));
            for (int i = 0; i < players.length; i++) {//play one round
                players[i].newRound(K);
            }
            endOfRound(players);
            k++;
        }
    }

    /**
     * Defines who has the best sum in the end of the current round and makes this person first in the next round.
     */
    @Override
    public void endOfRound(Player[] players){
        int max = 0;
        int number = 0; //number of the best player in the array
        for (int i = 0; i < players.length; i++){
            if (players[i].getSum()>max) {
                max = players[i].getSum();
                number = i;
            }
        }
        Player bufPlayer = players[0];
        players[0] = players[number];
        players[0].setVictories(players[0].getVictories()+1);
        players[number] = bufPlayer;
    }

    /**
     * Indicates if someone has won the game 7 times.
     */
    @Override
    public boolean isWinner(Player[] players){
        for (int i = 0; i < players.length; i++){
            if (players[i].getVictories()>6) {
                System.out.println("\n\n" + players[i].getName()+" HAS WON THE GAME 7 TIMES!");
                return true;
            }
        }
        return false;
    }
}
