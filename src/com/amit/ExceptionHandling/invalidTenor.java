package com.amit.ExceptionHandling;

public class invalidTenor extends Exception {

    public static final double MIN_TENOR = 12;
    public static final double MAX_TENOR = 240;

    invalidTenor(){

        super("Loan tenor must be in range of 12 and 24");

    }
}