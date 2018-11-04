package com.amit.Department_Dao;

public class Dept_Main {



    public static void main(String[] args) {

        departmentDao ddao = new departmentDao();

        Department deptTable = ddao.serachByDeptId(30);

        System.out.println(deptTable);
    }
}
