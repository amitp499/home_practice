package com.amit.Comparable_Comparator;

import java.util.Collections;
import java.util.Scanner;

public class Accounts_Main {

    public static void main(String[] args) {


        Accounts_Implementation ai = new Accounts_Implementation();


        ai.add(new Accounts("Andheri","Amit","Savings","3523524",501));
        ai.add(new Accounts("Colaba","Rahul","Loan","457547456",901));
        ai.add(new Accounts("Allahabad","Deepak","Credit","54645645",201));
        ai.add(new Accounts("Janghai","Priya","Personal","56848467",184));
        ai.add(new Accounts("Thane","Bablu","Offer","769734754",968));

        System.out.println("************Account Details - MENU***************");
        System.out.println("Press - B : To sort the accounts by Account Balance");
        System.out.println("Press - N : To sort the accounts by Account Number");
        System.out.println("Press - A : To sort the accounts by Account Name");
        System.out.println("Press - T : To sort the accounts by Account Type");
        System.out.println("Press - L : To sort the accounts by Account Branch Name");
        System.out.println("Press - E : To exit the Acount Details Terminal");


        Scanner sc = new Scanner(System.in);
        boolean invalidInFlag;

        invalidInFlag = false;

       while (true){
           System.out.println("=======================================================");
           System.out.println("Please type your input through Key Board : ");
           String kp = sc.nextLine();

            switch (kp.toUpperCase()){

                case "B" :
                    ai.displaySortedByActBalance();
                    break;

                case "N" :
                    ai.displaySortedByActNo();
                    break;

                case "A" :
                    ai.displaySortedByActName();
                    break;

                case "T" :
                    ai.displaySortedByActType();
                    break;

                case "L" :
                    ai.displaySortedByBranchName();

                    break;

                case  "E" :
                    System.out.println("Thank You - Visit Again, You have been exited from the application");
                    invalidInFlag = true;
                    break;


                default:
                    System.out.println("Incorrect Input - ReTry again");
                    //invalidInFlag = true;
                    break;

            }
            if (invalidInFlag == true){
                break;
            }
           //break;

        }





        //ai.displayAll();

       // Collections.sort(ai,);
    }
}
