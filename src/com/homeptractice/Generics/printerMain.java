package com.homeptractice.Generics;

import com.homeptractice.Generics.printer;

public class printerMain {

    public static void main(String[] args) {

        printer<Integer> printInt = new printer<>();

        printer<String> printString = new printer<>();

        printInt.print(100);

        printString.print("Hello World");

    }
}
