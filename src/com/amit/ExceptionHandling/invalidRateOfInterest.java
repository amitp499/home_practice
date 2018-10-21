package com.amit.ExceptionHandling;

public class invalidRateOfInterest extends Exception {

    public static final double MIN_Interest = 4;

    public static final double MAX_Interesr =25;

    invalidRateOfInterest(){    // Creating a constructor

        super("interest Rate must be in range of 4 and 25");  //Constructor chaining, calling the Exception constructor
                                                                //with desired message parameter
    }
}
