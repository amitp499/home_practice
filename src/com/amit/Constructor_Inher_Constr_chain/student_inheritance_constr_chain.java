package com.amit.Constructor_Inher_Constr_chain;

//inheritance, constructor chaining, method overiding
public class student_inheritance_constr_chain extends Student_Logic {

    private int subd;

    //constructor of derived class
    public student_inheritance_constr_chain(int suba, int subb, int subc, int subd){
        super(suba, subb, subc);  // constructor chaining
        this.subd=subd;
    }


    //method overiding
    public String checkMarks(){

        String result = "fail";

        if (suba>=passingMarks && subb>=passingMarks && subc>=passingMarks && subd>=passingMarks) {
            System.out.println("Passed in all 4 subjects");
            result = "pass";
        }
        else{

            System.out.println("Failed in subjects");
            result = "fail";
        }

        return result;
    }


}
