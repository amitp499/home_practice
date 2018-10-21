package com.amit.Abstract;

public abstract class account {

    protected int accountNo;
    protected String Name;
    protected long balance;

    abstract void abDeposit(long deposit);

    abstract void abWithdrawl(long with);


    account(int accountNo, String Name, long balance){

            this.accountNo = accountNo;
            this.Name = Name;
            this.balance = balance;

        System.out.println("abstract class constructor");
    }

    void deposit(long damount){

        System.out.println("Entered deposit method");

    }

    void withdrawl(long wamount){
        System.out.println("Entered withdrawl method");

    }


}
