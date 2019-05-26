package org.abstracts.home_work5_1;

abstract class AbstractStringPrinter {

   abstract void print(String str);
}
////интерфейсы
//        2) Создать интерфейсы IAnimal, Swimable, Flyable, IBird, IFish, придумать в них тестовые методы, создать несколько классов которые имплементируют имплементируют эти интерффейсы
//        Решение можно оформить в одном файле java - интерфейсы и классы просто объявлять не public: к примеру:
//
//        файл InterfaceDemo.java
//        package org.inteface.demo;
//
//interface IBird {
//
//    void fly();
//
//    void sing();
//}
//
//class Eagle implements IBird {
//
//    public void fly() {
//        System.out.println("Eagle fly high");
//    }
//
//    public void sing() {
//        System.out.println("Uiuiui");
//    }
//
//}
///**
// **	остальные интерфейсы и классы
// **/
//public class InterfaceDemo {
//
//    public static void main(String args[]) {
//        IBird bird = new Eagle();
//    }
//
//}
//
////статические методы
//3) Реализовать класс IntUtils
//        сделать его конструктор приватным
//        реализовать в этом классе статичесткие методы
//static int plus(int a, int b);
//static int minus(int a, int b);
//static int pow(int number, int pow); //возведение в степень
//static int getRandomInt(int minBound, int maxBount);
//
////задание на повторение циклов
//        3) пользователь вводит число с консоли
//        определить сколько делителей без остатка имеет число (к примеру введено число 8 - количество делителей 1, 2, 4, 8)



