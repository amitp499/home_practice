package com.amit.Comparable_Comparator;

import java.util.Comparator;

public class SortAcctName implements Comparator<Accounts> {

    public int compare(Accounts accName1, Accounts accName2){

        return accName1.getAcctName().compareTo(accName2.getAcctName());


    }

}
