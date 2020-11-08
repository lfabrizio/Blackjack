package com.fabrizio;

import java.util.Scanner;

public class Player {

    private String userName;
    int wager;
    private int cashBalance;
    // new deck for player here maybe?

    public Player(String userName){
        this.userName = userName;
    }

    //method to hit

    public int hit(Scanner userInput){
        int response = userInput.nextInt();
        return response;
    }

    //method to take players wager bet

    public int bet(Scanner playersBet){
        int firstBet = playersBet.nextInt();
        return firstBet;
    }

}
