package com.fabrizio;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {
    private List<Card> deck;

    public Deck(){
        this.deck = new ArrayList<Card>();
        for(int i = 0; i < 4; i++){
            for(int j = 0;j < 12; j++ ){
                deck.add(new Card(i, j));
            }
        }
    }

    public List<Card> getDeck() {
        return deck;
    }

    public void shuffle(){
        Card tempCard;
        Random random = new Random();
        for(int i = 0; i < 300; i++){
            int cardIndex1 = random.nextInt(deck.size()-1);
            int cardIndex2 = random.nextInt(deck.size()-1);
            tempCard = deck.get(cardIndex2);
            deck.set(cardIndex2, deck.get(cardIndex1));
            deck.set(cardIndex1, tempCard);

        }
    }
}