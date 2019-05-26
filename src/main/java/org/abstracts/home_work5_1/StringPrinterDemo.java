package org.abstracts.home_work5_1;
import java.util.Scanner;

public class StringPrinterDemo extends AbstractStringPrinter {
    Scanner inputReader = new Scanner(System.in);
    private boolean lifeCycle = true;

    public void application() {
        while (lifeCycle) {
            System.out.println("Please enter some string");
            print(inputReader.nextLine());
        }
    }

    public void print(String str) {
        System.out.println("Please enter string printer type (U - upper, L - lower)");
        String tp = inputReader.nextLine();
        switch (tp) {
            case ("U"):
                System.out.println("result is:" + str.toUpperCase());
                break;
            case ("L"):
                System.out.println("result is:" + str.toLowerCase());
                break;
            default:
                System.out.println("result is:" + str);
        }
   }
}
