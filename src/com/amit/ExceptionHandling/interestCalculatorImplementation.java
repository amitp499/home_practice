package com.amit.ExceptionHandling;

import static com.amit.ExceptionHandling.invalidPrincipal.MAX_Principal;
import static com.amit.ExceptionHandling.invalidPrincipal.MIN_Principal;
import static com.amit.ExceptionHandling.invalidRateOfInterest.MAX_Interesr;
import static com.amit.ExceptionHandling.invalidRateOfInterest.MIN_Interest;
import static com.amit.ExceptionHandling.invalidTenor.MAX_TENOR;
import static com.amit.ExceptionHandling.invalidTenor.MIN_TENOR;

public class interestCalculatorImplementation {

    static  void calc(long p, long t, long r) throws Exception{
        if ((p<MIN_Principal) || (p>MAX_Principal))

            throw new invalidPrincipal();

        if ((t<MIN_TENOR)||(t>MAX_TENOR))

            throw new invalidTenor();

        if ((r<MIN_Interest) || (r>MAX_Interesr))

            throw  new invalidRateOfInterest();

        double interestEarned = p*r/100/12*t;


    }
}
