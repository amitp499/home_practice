package com.amit.Abstract;

public class Transaction {


    public void transfer(int sourceAccount, int targetAccount, long amount){
        System.out.println("entered transfer method");

    }

    public void payBill(int debitAccount, String biller, long pamount ){
        System.out.println("entered payBill method");
    }
}
