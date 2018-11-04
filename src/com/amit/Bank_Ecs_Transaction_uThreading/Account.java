package com.amit.Bank_Ecs_Transaction_uThreading;

public class Account {

        private String accountNo;
        private String accountName;


        Account(String accountNo, String accountName){

            this.accountNo = accountNo;
            this.accountName = accountName;
        }

        public String getAccountName(){

            return accountName;
        }

        public String getAccountNo(){

            return getAccountNo();
        }
}
