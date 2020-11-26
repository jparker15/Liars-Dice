package com.atsignjar;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Die die = new Die();
        Random ran = new Random();

        die.roll(ran);
        System.out.println(die.getValue());
        die.roll(ran);
        System.out.println(die.getValue());
        die.roll(ran);
        System.out.println(die.getValue());
        die.roll(ran);
        System.out.println(die.getValue());
    }
}
