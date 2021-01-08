package com.atsignjar;

public class Player {

    static int Dice_Number = 7;
    private Cup cup;
    private String name;

    public Player(String name){
        this.name = name;
        cup = new Cup(Dice_Number);
    };

    //shake cup

    // peek

    //make claim
    // get from user two ints one for die value 1-6 and one for amount 1-14

    public int[] getClaim(){
        int dieValue, dieCount;
        Console console = new Console();
        dieValue = console.getInt(1,6,"Die Value( 1-6)");
        dieCount = console.getInt(1,14,"How" + dieValue + "many");

        return new int[] {dieValue,dieCount};

    }
}
