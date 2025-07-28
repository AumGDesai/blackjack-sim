/**
 * 
 * Aum Desai
 * CS231
 * 
 * Feb 12, 2023
 * 
 * Project 1: Simulation Class
 * 
 * Simulation.java
 */

public class Simulation {
    public static void main(String[] args){
        Blackjack one = new Blackjack();
        int a=0;
        int playerWin=0;
        int dealerWin=0;
        int draw=0;
        while(a<1000){
            int value = one.game(true);
            if (value == -1){
            dealerWin++;}
            if (value == 1){
            playerWin++;}
            if (value == 0){
            draw++;} 
            a++;
        }
    // Making the variables types floats
    float playerWin1 = (float) playerWin;
    float dealerWin1 = (float) dealerWin;
    float draw1 = (float) draw;

    // printing out the result
        System.out.println("The player won " + playerWin1 +" times, which is "+((playerWin1 /10 )+" percent of the game,"));
        System.out.println("The Dealer won " + dealerWin1 +" times, which is "+((dealerWin1 /10)+" percent of the game,"));
        System.out.println("Draw happened " + draw1 +" times, which is "+ ((draw1 /10)+" percent of the game."));
    }
}