package com.amit.ExceptionHandling;

public class invalidPrincipal extends Exception {

    public static final long MIN_Principal = 4000;
    public static final long MAX_Principal = 2500000;

    invalidPrincipal(){

        super("Principal must be in range of 4000 and 2500000");

    }
}
