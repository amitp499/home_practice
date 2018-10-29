package com.amit.Comparable_Comparator;

public class Accounts implements Comparable<Accounts>{

    String branchName;
    String acctName;
    String accType;
    String acctNo;
    int actBal;


    public Accounts(String branchName, String acctName, String accType, String acctNo, int actBal) {
        this.branchName = branchName;
        this.acctName = acctName;
        this.accType = accType;
        this.acctNo = acctNo;
        this.actBal = actBal;
    }


    @Override
    public int compareTo(Accounts bal) {
        return  this.actBal - bal.actBal;
    }

    @Override
    public String toString() {
        return "Accounts{" +
                "branchName='" + branchName + '\'' +
                ", acctName='" + acctName + '\'' +
                ", accType='" + accType + '\'' +
                ", acctNo='" + acctNo + '\'' +
                ", actBal=" + actBal +
                '}';
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getAcctName() {
        return acctName;
    }

    public void setAcctName(String acctName) {
        this.acctName = acctName;
    }

    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    public String getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(String acctNo) {
        this.acctNo = acctNo;
    }

    public double getActBal() {
        return actBal;
    }

    public void setActBal(int actBal) {
        this.actBal = actBal;
    }
}
