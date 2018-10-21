package com.homeptractice.Generics;

import com.homeptractice.Generics.Student_Comparator_CompareTo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student_Main_CompareTo {

    public static void main(String[] args) {

        List<Student_Comparator_CompareTo> students = new ArrayList();

        students.add(new Student_Comparator_CompareTo(101, 55,"Amit","pandey"));
        students.add(new Student_Comparator_CompareTo(105, 50,"ewr","sdasds"));
        students.add(new Student_Comparator_CompareTo(104, 45,"etewrt","sdsad"));
        students.add(new Student_Comparator_CompareTo(108, 98,"reyrty","ghgj"));

        Collections.sort(students);

        System.out.println("post sorting....");

        for (Student_Comparator_CompareTo obj: students ){
            System.out.println(obj);
        }

    }
}
