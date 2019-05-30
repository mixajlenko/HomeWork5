package org.statics.home_work5_3;

import java.util.Random;

public class IntUtils {

    private IntUtils() {
    }

   public static int plus(int a, int b) {
        int newPlus = a + b;

        return newPlus;
    }

   public static int minus(int a, int b) {
        int newMinus = a - b;

        return newMinus;
    }

   public static int pow(int number, int pow) {

        int newPow = (int) Math.pow(number, pow);
        return newPow;
    }

    static int getRandomInt(int minBound, int maxBound) {
        Random randomInt = new Random();

        int randomIntValue = randomInt.nextInt(maxBound - minBound) + minBound;
        return randomIntValue;
    }
}