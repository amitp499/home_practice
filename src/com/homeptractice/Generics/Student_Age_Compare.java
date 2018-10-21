package com.homeptractice.Generics;

import java.util.Comparator;

public class Student_Age_Compare implements Comparator<Student_Comparator_CompareTo> {

    public int compare(Student_Comparator_CompareTo a, Student_Comparator_CompareTo b){

        if (a.getAge() < b.getAge()){

            return  -1;

        }
        if (a.getAge() < b.getAge()){
            return 1;
        }
        else return 0;
    }
}
