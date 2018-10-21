package com.homeptractice.Generics;

public class Student_Comparator_CompareTo implements Comparable<Student_Comparator_CompareTo> {

    private int rollno;
    private  int age;
    private String firstname;
    private String lastname;


    public Student_Comparator_CompareTo(int rollno, int age, String firstname, String lastname){

        this.rollno =  rollno;

        this.age = age;

        this.firstname = firstname;

        this.lastname = lastname;

    }

    public int compareTo(Student_Comparator_CompareTo obj){

        System.out.println("Using CompareTo");

        return this.rollno - obj.rollno;

    }

    public String toString(){

        return rollno+", Name: "+firstname+" "+lastname+" age: "+age;

    }

    public int getAge(){
        return age;
    }

    public String getLastname(){
        return lastname;
    }
}
