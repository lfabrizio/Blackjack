package com.fabrizio;

public class Dealer {
    private String dealerName;
    private Deck dealerHand;

    public Dealer(String dealerName, Deck dealerHand){
        this.dealerName = dealerName;
        this.dealerHand = dealerHand;
    }

    public String getDealerName() {
        return dealerName;
    }

    public Deck getDealerHand() {
        return dealerHand;
    }
}
