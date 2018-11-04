package com.amit.Bank_Ecs_Transaction_uThreading;

public class Transaction implements Runnable {

    private payMerchant pmerchant;
    private  double deamount;
    private  String mer;
    private  String actn;


    public Transaction(payMerchant pmerchant, double deamount, String mer, String actn ){

            this.pmerchant=pmerchant;
            this.deamount = deamount;
            this.mer = mer;
            this.actn = actn;

    }

    @Override
    public void run() {

        String name = Thread.currentThread().getName();
        System.out.println(name+" this thread is performing debit transaction");

        pmerchant.debit( actn , deamount , "MSEB" );

    }
}
