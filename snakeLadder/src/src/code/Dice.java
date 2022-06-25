package src.code;

import java.util.Random;

public class Dice {
    int maxValue;
    Random random = new Random();

    public Dice(int maxValue) {
        this.maxValue = maxValue;
    }

    int roll() {
        return random.nextInt(6);
    }
}