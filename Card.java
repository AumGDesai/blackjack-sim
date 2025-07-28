/**
 * 
 * Aum Desai
 * CS231
 * 
 * Feb 12, 2023
 * 
 * Project 1: Card Class
 * Card.java
 * 
 */

public class Card {

    /**
     * The value of the card.
     */
    private int value;

    public Card(){
        //System.out.println("Does not work! Please input the value of the card as the parameter.");
    }

    /**
     * Constructs a card with the specified value.
     *@param val
     */
    public Card(int val) {
        if (val>0 && val<12){
            value = val;
        }
        else{
            System.out.println("The card value should be between 1 to 11.");
        }     
    }

    /**
     * Returns the value of the card.
     * @return the value of the card
     */
    public int getValue() {
        return value;
    }
    
    /**
     * Returns a string representation of this card.
     * @return a string representation of this card
     */
    public String toString() {
        // Card ace = new Card();
        // int aValue = ace.getValue();
        // System.out.println("The value of the Ace is " + aValue + ".");
        return Integer.toString(value);
    }
}
