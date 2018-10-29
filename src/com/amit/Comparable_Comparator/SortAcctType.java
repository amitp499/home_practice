package com.amit.Comparable_Comparator;

import java.util.Comparator;

public class SortAcctType implements Comparator<Accounts> {

    public int compare(Accounts acType1, Accounts acType2){

        return acType1.getAccType().compareTo(acType2.getAccType());

    }


}
