package com.amit.Abstract;

public class SavingAccount extends account {

    SavingAccount(int accountNo, String Name, long balance){

        super(accountNo,Name, balance );
        System.out.println("Saving account constructor");

        }

        void abDeposit(long sdepositAmount){

            System.out.println("Entered Saving Deposit");

        }

        void abWithdrawl(long swithAmount){

            System.out.println("Entered Saving withdrawal");

        }


}
