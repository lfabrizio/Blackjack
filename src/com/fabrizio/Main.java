package com.fabrizio;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Deck deck = new Deck();
        deck.shuffle();
        for(Card card: deck.getDeck()){
            System.out.println(card);
        }
    }
}
