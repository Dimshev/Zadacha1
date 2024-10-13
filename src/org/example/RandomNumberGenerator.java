package org.example;

import java.util.Random;

public class RandomNumberGenerator {
    private int lowerBound;
    private int upperBound;

    public RandomNumberGenerator(int lowerBound, int upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    public void generate() {
        Random random = new Random();
        System.out.println(random.nextInt(upperBound - lowerBound + 1) + lowerBound);
    }
}
