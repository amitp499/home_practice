package com.amit.Constructor_Inher_Constr_chain;

public class student_Main {

    public static void main(String[] args) {
	// write your code here

        //Student_Logic a1 = new Student_Logic(35,40,55);
        //Student_Logic a2 = new Student_Logic(35,30,55);
        //Student_Logic a3 = new Student_Logic(60,40,55);

        student_inheritance_constr_chain a1 = new student_inheritance_constr_chain(35,40,55, 65);
        student_inheritance_constr_chain a2 = new student_inheritance_constr_chain(35,30,55, 67);
        student_inheritance_constr_chain a3 = new student_inheritance_constr_chain(60,40,55, 63);

        student_inheritance_constr_chain.valMarks(Student_Logic.passingMarks);
        //Student_Logic.valMarks(Student_Logic.passingMarks);

        a1.checkMarks();
        a2.checkMarks();
        a3.checkMarks();

        //Student_Logic.passingMarks = 40;
        student_inheritance_constr_chain.passingMarks=40;

        a1.checkMarks();
        a2.checkMarks();
        a3.checkMarks();

        //Student_Logic.valMarks(Student_Logic.passingMarks);

        student_inheritance_constr_chain.valMarks(Student_Logic.passingMarks);

        //Student_Logic.passingMarks = 50;
        student_inheritance_constr_chain.passingMarks=50;

        a1.checkMarks();
        a2.checkMarks();
        a3.checkMarks();

        //Student_Logic.valMarks(Student_Logic.passingMarks);
        student_inheritance_constr_chain.valMarks(Student_Logic.passingMarks);

    }
}
