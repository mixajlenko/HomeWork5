package org.interfaces.home_work5_2;

public class Fauna implements Swimable,Flyable{

    static class Cat implements IAnimal {

        @Override
        public void run() {
            System.out.println("I can running for birds.\n");
        }

        @Override
        public void swim() {
            System.out.println("I HATE WATER!\n");
        }

        @Override
        public void say() {
            System.out.println("also i say: meow! meow! I want to eat!\n");
        }

    }

    static class ClownFish implements IFish {

        @Override
        public void swim() {
            System.out.println("All of fish can swim.\nBut not all of them know it:D\n");
        }
    }

    static class Shark implements IFish {

        @Override
        public void swim() {
            System.out.println("I can swim all my life.\n");
        }

    }

    static class Duck implements IBird {

        @Override
        public void fly() {
            System.out.println("flyyyyyy. Yeeeaaap..\n");
        }

        @Override
        public void swim() {
            System.out.println("fly it`s okay.\n");
        }

        @Override
        public void sing() {
            System.out.println("KRYAKRYA\n");
        }

        public void run() {
            System.out.println("run! vzhhhhh\n");
        }

        public void meme() {
            System.out.println("I can everything!\n");
        }
    }

    static class Eagle implements IBird {
        @Override
        public void fly() {
            System.out.println("I can fly very height.\n");
        }

        @Override
        public void swim() {
            System.out.println("But, i can`t swim.\n");
        }

        @Override
        public void sing() {
            System.out.println("My song is very loud.");
        }
    }

    static class Lion implements IAnimal {

        @Override
        public void run() {
            System.out.println("I can run very fast!\n");
        }

        @Override
        public void swim() {
            System.out.println("And i can swim if you want.\n");
        }

        @Override
        public void say() {
            System.out.println("GRRRRRR! I`m a KING of animal!\n");
        }

    }

    static class Penguin implements IBird {
        @Override
        public void fly() {
            System.out.println("Everyone think what i can`t fly.\n");
        }

        @Override
        public void swim() {
            System.out.println("But, have you ever seen how i swim?\nIt`s true flight.\n");
        }

        @Override
        public void sing() {
            System.out.println("gulugulu\n");
        }
    }

    static class Wolf implements IAnimal {
        @Override
        public void run() {
            System.out.println("run run run\n");
        }

        @Override
        public void swim() {
            System.out.println("swim swim swim\n");
        }

        @Override
        public void say() {
            System.out.println("I`m volchara. Prepare your bochok for kus`\n");
        }
    }

    @Override
    public void canFly() {
        System.out.println("yes. I can fly.\n");
    }

    @Override
    public void canSwim() {
        System.out.println("yes. I can swim.\n");
    }
}
