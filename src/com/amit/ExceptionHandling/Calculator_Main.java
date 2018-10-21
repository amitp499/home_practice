package com.amit.ExceptionHandling;

public class Calculator_Main {

    public static void main(String[] args) {

        try {

            interestCalculatorImplementation.calc(2100000,15,18);

            interestCalculatorImplementation.calc(2100000,16,18);

            interestCalculatorImplementation.calc(2100000,18,30);

        }
        catch (Exception c){

            System.out.println("somthing went wrong "+c.getMessage());
        }
        finally {

            System.out.println("End of calculator");

        }

    }
}
