package com.homeptractice.Generics;

import com.homeptractice.Generics.Student_Comparator_CompareTo;

import java.util.Comparator;

public class Student_Lastname_Compare implements Comparator<Student_Comparator_CompareTo> {

    public  int compare(Student_Comparator_CompareTo c, Student_Comparator_CompareTo d){

           return  c.getLastname().compareTo(d.getLastname());

        }
}
