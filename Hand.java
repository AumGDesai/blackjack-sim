/**
 * 
 * Aum Desai
 * CS231
 * 
 * Feb 12, 2023
 * 
 * Project 1: Hand Class
 * 
 * Hand.java
 */

import java.util.ArrayList;

public class Hand {

    private ArrayList<Card> hand;

    /**
     * Creates an empty hand as an ArrayList of Cards.  
     */
    public Hand(){
        hand = new ArrayList<Card>();
    }

    /**
     * Removes any cards currently in the hand. 
     */
    public void reset(){
        hand = new ArrayList<Card>();
    }

    /**
     * Adds the specified card to the hand.
     * @param card the card to be added to the hand
     */
    public void add(Card card){
        hand.add(card);
    }

    /**
     * Returns the number of cards in the hand.
     * @return the number of cards in the hand
     */
    public int size(){
        return hand.size();
    }

    /**
     * Returns the card in the hand specified by the given index. 
     * @param index the index of the card in the hand.
     * @return the card in the hand at the specified index.
     */
    public Card getCard(int index){
        return hand.get(index);
    }

    /**
     * Returns the summed value over all cards in the hand.
     * @return the summed value over all cards in the hand
     */
    public int getTotalValue(){
        int totalValue = 0;
        int value = 0;
        for (Card index: hand){
            value = index.getValue();
            totalValue += value;
        }
        return totalValue;
    }

    /**
     * Returns a string representation of the hand.
     * @return a string representation of the hand
     */
    public String toString(){
        String s = "[";
        for (int i = 0; i < hand.size(); i++) {
            s += hand.get(i).toString();
            if (i < hand.size() - 1) {
                s += ", ";
            }
        }
        s += "] : " + getTotalValue();
        return s;
    }
}