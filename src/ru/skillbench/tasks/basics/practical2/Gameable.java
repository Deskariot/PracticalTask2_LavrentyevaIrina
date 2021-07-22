package ru.skillbench.tasks.basics.practical2;

/**
 * todo Document type Gameable
 */
public interface Gameable {
    public void playGame(int N, int K);
    public void endOfRound(Player[] players);
    public boolean isWinner(Player[] players);
}
