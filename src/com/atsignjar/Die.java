package com.atsignjar;

import java.util.Random;

public class Die {
    private int value;
    private int sides;

    public Die(){
        sides = 6;
        value = 5;
    }

    public void roll (Random rand){
        this.value = rand.nextInt(sides) + 1;
    }
    public int getValue() { return this.value;}
}
