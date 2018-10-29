package com.amit.Comparable_Comparator;

import java.util.Comparator;

public class SortAcctNo implements Comparator<Accounts> {

    public int compare(Accounts aNo1, Accounts aNo2){

        return aNo1.getAcctNo().compareTo(aNo2.getAcctNo());


    }


}
