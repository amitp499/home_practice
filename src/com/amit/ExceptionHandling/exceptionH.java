package com.amit.ExceptionHandling;

import jdk.nashorn.internal.ir.JumpToInlinedFinally;

public class exceptionH {

    public static void main(String[] args) {
        try{
            Integer i = 10/2;
            int a[] = {10,2};

            int x =a[3];
        }
        catch(ArithmeticException | ArrayIndexOutOfBoundsException e){  //using built in exception

            System.out.println(e.getMessage());

        }
        finally {
            System.out.println("end of program");
        }



    }
}
