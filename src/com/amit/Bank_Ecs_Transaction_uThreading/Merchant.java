package com.amit.Bank_Ecs_Transaction_uThreading;

public class Merchant extends Account{

    private String caccountNo;
    private  String cName;
    private  String merchantName;
    private double damount;

    Merchant(String caccountNo,String cName,double damount, String merchantName ){

        super(caccountNo,cName);

        this.damount = damount;
        this.merchantName = merchantName;

    }


    public String getCaccountNo(){

        return caccountNo;
    }

    public String getcName(){

        return cName;
    }

    public String getMerchantName(){

        return merchantName;
    }

    public double getDamount (){

        return damount ;
    }

}
