package com.homeptractice.Generics;

import com.homeptractice.Generics.Student_Age_Compare;
import com.homeptractice.Generics.Student_Comparator_CompareTo;

import java.util.ArrayList;
import java.util.Collections;

public class Student_Main_Compare {

    public static void main(String[] args) {

        ArrayList <Student_Comparator_CompareTo> list = new ArrayList();

        list.add(new Student_Comparator_CompareTo(101, 55,"Amit","Aa"));
        list.add(new Student_Comparator_CompareTo(105, 50,"jhon","Bb"));
        list.add(new Student_Comparator_CompareTo(104, 45,"etewrt","Cc"));
        list.add(new Student_Comparator_CompareTo(108, 98,"reyrty","Dd"));

        System.out.println("Sorted by Age");

        Student_Age_Compare agec = new Student_Age_Compare();

        Collections.sort(list,agec );

        for (Student_Comparator_CompareTo a : list){

            System.out.println(a);
        }

        System.out.println("Sorted by LastName");

        Student_Age_Compare lastname = new Student_Age_Compare();

        Collections.sort(list,lastname );

        for (Student_Comparator_CompareTo b : list){

            System.out.println(b);
        }
    }


}
