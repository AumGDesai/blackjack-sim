/**
 * 
 * Aum Desai
 * CS231
 * 
 * Feb 12, 2023
 * 
 * Project 1: Deck Class
 * 
 * Deck.java
 */

import java.util.ArrayList;
import java.util.Random;

public class Deck {

    private ArrayList<Card> deck;

    /**
     * Creates the underlying deck as an ArrayList of Card objects. 
     * Calls build() as a subroutine to build the deck itself.
     */
    public Deck() {
        deck = new ArrayList<>();
        build();
        shuffle();
    }

    /**
     * Builds the underlying deck as a standard 52 card deck. 
     * Replaces any current deck stored. 
     */
    public void build(){
        deck.clear();
        for (int i=2; i<10; i++){
            for(int j=0; j<4; j++){
                Card card = new Card(i);
                deck.add(card);
            }
        }
        for(int i=0; i<4; i++){
            Card card = new Card(11);
            deck.add(card);
        }
        for (int i=0; i<16; i++){
            Card card = new Card(10);
            deck.add(card);
        }
        shuffle();
    }

    public void reset()
    {
        deck.clear();
        build();
    }

    /**
     * Returns the number of cards left in the deck. 
     * @return the number of cards left in the deck
     */
    public int size() {
        return deck.size();
    }

    /**
     * Returns and removes the first card of the deck.
     * @return the first card of the deck
     */
    public Card deal() {
        if (deck.size() == 0) {
            this.build();
        }
        return deck.remove(0);
    }

    public Card pick(int i){
        //returns the card at position i and removes it from the deck
        return deck.remove(i);
    }

    /**
     * Shuffles the cards currently in the deck. 
     */
    public void shuffle() {
        Random r = new Random();
        ArrayList<Card> deck2 = new ArrayList<Card>();
        for (int j=0; j< 52; j++) {

            deck2.add(deck.remove(r.nextInt(size())));
        }
        deck = deck2;
        System.out.println(deck);
    }

    /**
     * Returns a string representation of the deck.
     * @return a string representation of the deck
     */
    public String toString() {
        String s = "Deck has cards: ";
        int value = 0;
        for (Card i: deck){
            value = i.getValue();
            s += value + ",";
        }
        return s;
    }

    //extension
    public void deck8(){
        deck.clear();
        for (int i = 0; i < 8; i++){
            build();
        }
        shuffle();
    }

}


