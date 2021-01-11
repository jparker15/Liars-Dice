package com.atsignjar;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cup {

        private ArrayList<Die> dice = new ArrayList<>();

        public Cup (int diceAmt){
            for (int count = 0; count < diceAmt; count++){
                dice.add(new Die());
            }
        }

        public void addDie(){
            dice.add(new Die());
        }

        public void removeDie(){
            dice.remove(dice.size() - 1);
        }

        public void peek(){
            String output = "";
            for (var die: dice){
                output += die.getValue() + "";
            }
            System.out.println(output.trim());
        }

        public void roll(){
            Random random = new Random();
            for (var die: dice){
                die.roll(random);
            }
        }

        @Override
        public String toString(){
            String output = "";
            for (Die die:dice) {
                output += die.getValue() + "";
            }
            return output.trim();
        }
}
