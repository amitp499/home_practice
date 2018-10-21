package com.amit.Constructor_Inher_Constr_chain;

public class Student_Logic {

    public static int passingMarks=35;
    int suba, subb, subc;

    //conrustor
    public Student_Logic(int suba,int subb,int subc){

        this.suba = suba;
        this.subb = subb;
        this.subc = subc;

    }

    public static void valMarks(int marks){

        //marks = passingMarks;

        if (marks>40){
            System.out.println("Passing marks cannot be greater than "+marks);
        }

    }

    public String checkMarks(){
        String result = "Fail";
        if (suba>=passingMarks && subb>=passingMarks && subc>=passingMarks){
            System.out.println("Pass");
            result="Pass";
        }

        else
        {
            System.out.println("Fail");
            result="fail";
        }
        return result;
    }
}
