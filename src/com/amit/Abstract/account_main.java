package com.amit.Abstract;

public class account_main {

    public static void main(String[] args) {

            Transaction t = new Transaction();
            account aa = new SavingAccount(2354546, "Amit",5000);
            account bb = new CurrentAccount(65765754, "Priya",43523);

            t.payBill(4235465,"MSEB", 5464356);
            t.transfer(554634765,56546546,5462);

            aa.abDeposit(435234);
            aa.abWithdrawl(54646);

            bb.abDeposit(345);
            bb.abWithdrawl(546);


    }

}
