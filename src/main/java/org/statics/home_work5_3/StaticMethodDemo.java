package org.statics.home_work5_3;

import java.util.Scanner;

public class StaticMethodDemo {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число.");
        int userInput = scan.nextInt();
        System.out.println("Введите второе число.");
        int userInput2 = scan.nextInt();
        System.out.println("Введите минимальное число рандомайзера.");
        int randomBoundMin = scan.nextInt();
        System.out.println("Введите максимальное число рандомайзера.");
        int randomBoundMax = scan.nextInt();

        int FirstRandValue = IntUtils.getRandomInt(randomBoundMin, randomBoundMax);
        int SecondRandValue = IntUtils.getRandomInt(randomBoundMin, randomBoundMax);


        System.out.println("Результат вычитания: " + userInput + " - " + userInput2 + " = " + IntUtils.minus(userInput,userInput2));
        System.out.println("Результат добавления: " + userInput + " + " + userInput2 + " = "  + IntUtils.plus(userInput,userInput2));
        System.out.println("Результат возведения: " + userInput + " ^ " + userInput2 + " = "  + IntUtils.pow(userInput,userInput2));

        System.out.println("Результат вычитания случайных чисед: " + FirstRandValue + " - " + SecondRandValue + " = "  + IntUtils.minus(FirstRandValue, SecondRandValue));
        System.out.println("Результат добавления случайных числе: " + FirstRandValue + " + " + SecondRandValue + " = "  + IntUtils.plus(FirstRandValue, SecondRandValue));
        System.out.println("Результат возведения случайных чисел: " + FirstRandValue + " ^ " + SecondRandValue + " = "  + IntUtils.pow(FirstRandValue, SecondRandValue));

    }
}
