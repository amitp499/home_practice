package com.amit.Interface;

public class hardisk implements  storage{

    @Override
    public void read() {
        System.out.println(" Hardisk read");
    }

    @Override
    public void write() {
        System.out.println(" Hardisk wriite");
    }
}
