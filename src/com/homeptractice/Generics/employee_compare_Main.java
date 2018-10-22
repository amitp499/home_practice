package com.homeptractice.Generics;

import java.util.ArrayList;
import java.util.Collections;

public class employee_compare_Main {

    public static void main(String[] args) {

        ArrayList<employee_details> xx = new ArrayList<>();

        xx.add(new employee_details(30,44,"Amit","Pandey"));
        xx.add(new employee_details(29,55,"Pota","Dubey"));
        xx.add(new employee_details(25,45,"Punnu","Mishra"));
        xx.add(new employee_details(20,40,"Nunnu","Thira"));


        empid_compare eeid = new empid_compare();

        System.out.println("Arranged in Emp id");
        Collections.sort(xx,eeid);

        for (employee_details a: xx){

            System.out.println(a);
        }

        empname_compare ename = new empname_compare();

        Collections.sort(xx, ename);

        System.out.println("Arranged in Emp firstname");
        for(employee_details b: xx){
            System.out.println(b);
        }



    }
}
