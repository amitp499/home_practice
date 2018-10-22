package com.homeptractice.Generics;

import java.util.Comparator;

public class empid_compare implements Comparator<employee_details> {

    public int compare(employee_details a, employee_details b){

        if (a.getEid()>b.getEid())
            return 1;
        if (a.getEid()<b.getEid())
            return -1;
        else
            return 0;
    }
}
