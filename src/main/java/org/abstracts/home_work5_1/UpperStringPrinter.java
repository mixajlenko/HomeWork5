package org.abstracts.home_work5_1;

public class UpperStringPrinter extends AbstractStringPrinter {

    @Override
    void print(String str) {
        System.out.println("result is:" + str.toUpperCase());
    }
}
