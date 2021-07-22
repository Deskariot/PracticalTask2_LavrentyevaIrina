package ru.skillbench.tasks.basics.practical2;

/**
 * todo Document type Playable
 */
public interface Playable { //implements the game

    int throwDice();

    void newRound(int K); //K is number of dices, N is number of players
}
