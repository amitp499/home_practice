package com.homeptractice.Generics;

public class employee_details implements Comparable<employee_details> {

    private int eage;
    private int eid;
    private String firstName;
    private String lastName;

    employee_details(int eage,int eid, String firstName,String lastName ){

        this.eage =eage;
        this.eid= eid;
        this.firstName=firstName;
        this.lastName = lastName;

    }

    @Override
    public int compareTo(employee_details o) {
        return this.eage-eage;
    }

    @Override
    public String toString() {

        return "employee_details{" +
                "eage=" + eage +
                ", eid=" + eid +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return lastName;
    }
}
