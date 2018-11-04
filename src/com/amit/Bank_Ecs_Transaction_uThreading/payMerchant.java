package com.amit.Bank_Ecs_Transaction_uThreading;



public class payMerchant implements  AccountInterface{

    private SavingsAccount dactNo;
    private Merchant mear;
    private double damount;

    payMerchant(SavingsAccount dactNo,double damount, Merchant mear ){

        this.dactNo = dactNo;
        this.damount = damount;
        this.mear = mear;
    }

    public void debit(String actNo, double damount,String mear1){

        delay();
            synchronized (dactNo){

                double temp = dactNo.getBalance() - damount;

                if (temp>1000){

                    System.out.println("Transaction Success: mearchant "+mear.getMerchantName()+" debited you account with amount INR "+damount);
                    dactNo.setBalance(temp);
                }else{

                    System.out.println("Insufficient bal in your account : Transaction Failed");
                    delay();
                }

                System.out.println("Dear "+dactNo.getSaccountName()+" your balance is "+dactNo.getBalance());
            }


        }

        public void delay(){

        try {
            Thread.sleep(100);
        }catch (InterruptedException e){

            e.getMessage();
        }


        }
}
