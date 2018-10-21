package com.amit.Abstract;

public class CurrentAccount extends account {

    CurrentAccount(int accountNo, String Name, long balance){

        super(accountNo, Name, balance);
        System.out.println("current account constructor");

    }

    void abDeposit(long cdepositAmount){

        System.out.println("Entered Current Deposit");

    }

    void abWithdrawl(long cwithAmount){

        System.out.println("Entered Current withdrawal");

    }
}
