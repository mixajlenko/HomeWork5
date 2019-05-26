package org.statics.home_work5_3;

import java.util.Random;

public class IntUtils {

    private IntUtils(){}

    static int plus(int a, int b){
    int newPlus = a + b;

    return newPlus;
    }
    static int minus(int a, int b){
    int newMinus = a - b;

    return newMinus;
    }
    static int pow(int number, int pow){

       int newPow = (int) Math.pow(number, pow);
       return newPow;
    }//возведение в степень

    static int getRandomInt(int minBound, int maxBound){
        Random randomInt = new Random();

        int randomIntValue = randomInt.nextInt(maxBound - minBound) + minBound;
        return randomIntValue;
    }
}



//    3) Реализовать класс IntUtils
//    сделать его конструктор приватным
//    реализовать в этом классе статичесткие методы
//    static int plus(int a, int b);
//    static int minus(int a, int b);
//    static int pow(int number, int pow); //возведение в степень
//    static int getRandomInt(int minBound, int maxBount);


//задание на повторение циклов
//3) пользователь вводит число с консоли
//        определить сколько делителей без остатка имеет число (к примеру введено число 8 - количество делителей 1, 2, 4, 8)