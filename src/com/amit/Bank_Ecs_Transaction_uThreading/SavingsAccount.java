package com.amit.Bank_Ecs_Transaction_uThreading;

public class SavingsAccount extends Account {

    private String saccountNo;
    private  String saccountName;
    private double balance;



        SavingsAccount(String saccountNo,String saccountName,double balance ){

            super(saccountNo,saccountName);

            this.balance = balance;
        }

        public String getSaccountNo(){

            return saccountNo;

        }

        public String getSaccountName(){

            return saccountName;
        }

        public double getBalance(){
            return balance;
        }

    public void setBalance(double bal){
        this.balance=bal;
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "saccountNo='" + saccountNo + '\'' +
                ", saccountName='" + saccountName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
