package com.amit.Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Accounts_Implementation {

    static ArrayList<Accounts> act = new ArrayList<>();

    SortAcctName an = new SortAcctName();
    SortAcctNo ano = new SortAcctNo();
    SortAcctType at = new SortAcctType();
    SortBranchName ab = new SortBranchName();


    public  void displaySortedByBranchName(){

        Collections.sort(act,ab);

        for (Accounts e :act) {

            System.out.println(e);

        }
    }

    public  void displaySortedByActType(){

        Collections.sort(act,at);

        for (Accounts e :act) {

            System.out.println(e);

        }
    }

    public  void displaySortedByActNo(){

        Collections.sort(act,ano);

        for (Accounts e :act) {

            System.out.println(e);

        }
    }

    public void add(Accounts aa){

        act.add(aa);

    }



    public void displayAll(){

        for (Accounts e :act) {

            System.out.println(e);

        }
    }

    public  void displaySortedByActBalance(){

        Collections.sort(act);

        for (Accounts e :act) {

            System.out.println(e);

        }
    }

    public  void displaySortedByActName(){

        Collections.sort(act,an);

        for (Accounts e :act) {

            System.out.println(e);

        }
    }
}
