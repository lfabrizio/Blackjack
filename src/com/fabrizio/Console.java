package com.fabrizio;

import java.util.Scanner;

public class Console {

    public Console(){

    }

    public void playGame(){
        System.out.println("Welcome to Blackjack!!");
        //  create a playing deck
        Deck playingDeck = new Deck();
        playingDeck.shuffle();

        Scanner scan = new Scanner(System.in);
        // here verify players balance and then prompt wager bet through scanner
        //possible while loop for game loop
        Deck playerOnesDeck = new Deck();
        int playerBalance = 200;
        while(playerBalance > 0){
            // play continues
            System.out.println("You have $" + playerBalance + ", How much would you like to wager?");
            int playersBet = scan.nextInt();
            if(playersBet > playerBalance){
                System.out.println("Insufficient funds!");
                break;
            }
            // two cards for player
            playerOnesDeck.draw(playingDeck);
            playerOnesDeck.draw(playingDeck);

            //two cards for the dealer
        }
        System.out.println("Game over! Add more money to continue playing");

    }
}
