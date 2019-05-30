package org.abstracts.home_work5_1;
import java.util.Scanner;

public class StringPrinterDemo {
    Scanner inputReader = new Scanner(System.in);
    private boolean lifeCycle = true;

    public void application() {
        while (lifeCycle) {
            System.out.println("Please enter some string");
            transformation(inputReader.nextLine());
        }
    }

    public void transformation (String str) {
        System.out.println("Please enter string printer type (U - upper, L - lower)");
        String tp = inputReader.nextLine();
        switch (tp) {
            case ("U"):
                UpperStringPrinter getUp = new UpperStringPrinter();
                getUp.print(str);
                break;
            case ("L"):
                LowerStringPrinter getLow = new LowerStringPrinter();
                getLow.print(str);
                break;
            default:
                System.out.println("result is:" + str);
        }
   }
}
