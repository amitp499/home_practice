package com.homeptractice.Generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class employee_compareTo_Main {

    public static void main(String[] args) {


        ArrayList<employee_details> e = new ArrayList<>();
        e.add(new employee_details(30,44,"Amit","Pandey"));
        e.add(new employee_details(29,55,"Pota","Dubey"));
        e.add(new employee_details(25,45,"Punnu","Mishra"));
        e.add(new employee_details(20,40,"Nunnu","Thira"));

        Collections.sort(e);

        for (employee_details a : e)
                System.out.println(a);

    }
}
