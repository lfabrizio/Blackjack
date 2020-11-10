package com.fabrizio;


import java.util.List;

public class Card {
    // 13 cards per suit , 4 suits
    // todo: eventually make values and suits into enums
    private final String[] values = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
    private final String[] suits = {"Diamonds", "Hearts", "Clubs", "Spades"};
    private String suit;
    private String value;

    public Card(int suitValue, int value){
        this.suit = suits[suitValue];
        this.value = values[value];
    }




    public String[] getSuits() {
        return suits;
    }

    public String[] getValues() {
        return values;
    }

    public String getSuit() {
        return suit;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Card{" +
                "value='" + value + '\'' +
                "suit='" + suit + '\'' +
                '}';
    }
}
