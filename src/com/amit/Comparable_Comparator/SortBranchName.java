package com.amit.Comparable_Comparator;

//import com.amit.Bank_Ecs_Transaction_uThreading.Account;

import java.util.Comparator;

public class SortBranchName implements Comparator<Accounts> {

    public int compare(Accounts brName1, Accounts brName2){

        return brName1.getBranchName().compareTo(brName2.getBranchName());

    }
}
