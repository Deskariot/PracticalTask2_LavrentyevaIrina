package ru.skillbench.tasks.basics.practical2;

/**
 * todo Document type Player
 */
public class Player implements Playable{

    private String name = "No Name";
    private int sum = 0;
    private int victories = 0;

    public int getVictories() {
        return victories;
    }

    public void setVictories(int victories) {
        this.victories = victories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    @Override
    public int throwDice() { //every dice has 6 facets, 1-6
        return (int) (Math.random()*6+1);
    }

    /**
     * Simulates a round of a game for one player.
     */
    @Override
    public void newRound(int K) { //K is number of dices
        for (int j = 0; j < K; j++){ //for each dice
            int result = throwDice();
            this.setSum(this.sum + result);
            System.out.println(this.name + ", dice №" + (j+1) + ", Result: " + result + ", Current sum: " + this.getSum());
        }
    }
}
