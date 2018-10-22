package com.homeptractice.Generics;

import java.util.Comparator;

public class empname_compare implements Comparator<employee_details> {

    public int compare(employee_details x, employee_details y){

        return x.getFirstName().compareTo(y.getFirstName());

    }


}
