package com.atsignjar;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
       Cup player1Cup = new Cup(5);

       player1Cup.peek();
       player1Cup.roll();
       player1Cup.peek();
       player1Cup.addDie();
        player1Cup.peek();
        player1Cup.roll();
        player1Cup.peek();
        player1Cup.removeDie();

//       int value = console.getInt(1,6,"Die Value( 1-6)");
//       int count = console.getInt(1,14,"How" + value + "many");

    }
    /**
     * improvements:
     * print out end of round info. call out lai9r and declare who lost a die
     * declare a player is removed from game
     * improve overall print outs
     * clea console at start of next player turn
     * allow user to enter how many players
     *
     * TODO:each round should start with a new player
     */

}
