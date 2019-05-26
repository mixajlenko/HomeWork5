package org.interfaces.home_work5_2;

import java.util.Scanner;

public class Specifications {

    Scanner userInput = new Scanner(System.in);

    private boolean lifeCycle = true;

    public void specific() {
        while (lifeCycle) {
            System.out.println("Enter the entity:\n(Animal, Bird, Fish)\nOr\nEnter te specification: (Swimable, Flyable)");
            app(userInput.nextLine());
        }
    }

    Fauna f = new Fauna();

    private void app(String nextLine) {
        switch (nextLine) {
            case ("Animal"):
                System.out.println("Choose your animal: Lion, Cat, Wolf.");
                String choiseAnimal = userInput.nextLine();
                switch (choiseAnimal) {
                    case ("Lion"):
                        Fauna.Lion l = new Fauna.Lion();
                        l.run();
                        l.swim();
                        l.say();
                        break;
                    case ("Cat"):
                        Fauna.Cat c = new Fauna.Cat();
                        c.run();
                        c.swim();
                        c.say();
                        break;
                    case ("Wolf"):
                        Fauna.Wolf w = new Fauna.Wolf();
                        w.run();
                        w.swim();
                        w.say();
                        break;
                }
                return;
            case ("Bird"):
                System.out.println("Choose your bird: Penguin, Duck, Eagle.");
                String choiseBird = userInput.nextLine();
                switch (choiseBird) {
                    case ("Penguin"):
                        Fauna.Penguin p = new Fauna.Penguin();
                        p.fly();
                        p.swim();
                        p.sing();
                        break;
                    case ("Duck"):
                        Fauna.Duck d = new Fauna.Duck();
                        d.sing();
                        d.run();
                        d.meme();
                        break;
                    case ("Eagle"):
                        Fauna.Eagle e = new Fauna.Eagle();
                        e.sing();
                        e.swim();
                        break;
                }
                return;
            case ("Fish"):
                System.out.println("Choose your fish: Shark, ClownFish.");
                String choiseFish = userInput.nextLine();
                switch (choiseFish) {
                    case ("Shark"):
                        Fauna.Shark s = new Fauna.Shark();
                        s.swim();
                        break;
                    case ("ClownFish"):
                        Fauna.ClownFish c = new Fauna.ClownFish();
                        c.swim();
                        break;
                }
                return;
            case ("Swimable"):
                System.out.println("Enter your entity:\n(Duck, Penguin, Shark, ClownFish, Lion, Wolf)");
                String swimable = userInput.nextLine();
                switch (swimable) {
                    case ("Lion"):
                        Fauna.Lion l = new Fauna.Lion();
                        l.swim();
                        f.canSwim();
                        break;
                    case ("Wolf"):
                        Fauna.Wolf w = new Fauna.Wolf();
                        w.swim();
                        f.canSwim();
                        break;
                    case ("Penguin"):
                        f.canSwim();
                        break;
                    case ("Duck"):
                        Fauna.Duck d = new Fauna.Duck();
                        f.canSwim();
                        f.canFly();
                        d.meme();
                        break;
                    case ("Shark"):
                        f.canSwim();
                        break;
                    case ("ClownFish"):
                        f.canSwim();
                        break;
                }
                return;
            case ("Flyable"):
                System.out.println("Enter your entity:\n(Duck, Penguin, Eagle)");
                String flyable = userInput.nextLine();
                switch (flyable) {
                    case ("Penguin"):
                        f.canFly();
                        break;
                    case ("Duck"):
                        Fauna.Duck d = new Fauna.Duck();
                        f.canSwim();
                        f.canFly();
                        d.meme();
                        break;
                    case ("Eagle"):
                        f.canFly();
                        break;
                }
                return;
        }
    }
}


