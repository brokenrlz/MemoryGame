package com.example.memorygame;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DeckOfCards {

    private ArrayList<Card> deck;

    public DeckOfCards() {
        this.deck = new ArrayList<>();
        List<String> suits = Card.getValidSuits();
        List<String> faceNames = Card.getValidFaceNames();
        for (String suit : suits) {
            for (String faceName: faceNames){
                deck.add(new Card(suit,faceName));
            }
        }
    }
    /**
     * this method will shuffle the cards objects
     */
    public void shuffle(){

        Collections.shuffle(deck);
    }
    /**
     * This method will return the top card from the deck
     * if the deck is empty it will return null.
     */
    public Card dealTopCard(){
        if(deck.size()>0){
            return deck.remove(0);
        }else{
            return null;
        }
    }
        /**
         * This returns the numbers of card left in the deck.
         */

        public int getNumOfCards(){
            return deck.size();
        }

}
