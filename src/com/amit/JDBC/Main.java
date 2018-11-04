package com.amit.JDBC;

import java.sql.*;

public class Main {

    public static void main(String[] args) {

        Connection con = null;
        Statement stm = null;
        ResultSet rs = null;

        try{

            Class.forName("oracle.jdbc.OracleDriver");
            System.out.println("jdbc driver found and loaded");
        }catch (ClassNotFoundException cl){
            System.out.println(cl.getMessage());
        }

        try{

            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe","hr","hr");
        }catch (SQLException e){

            System.out.println(e.getMessage());
        }

        try {

            stm = con.createStatement();
        }catch (SQLException ss){
            System.out.println(ss.getMessage());
        }


        try {
            rs = stm.executeQuery("SELECT first_name, last_name FROM employees");
        }catch (SQLException sq){

            System.out.println(sq.getMessage());
        }

        try {


            while (rs.next()) {

                String fname = rs.getString(1);
                String lname = rs.getString(2);

                System.out.println("First Name "+fname+" last Name "+lname);
            }
        }catch (SQLException qq){

            System.out.println(qq.getMessage());
        }

        try {
            rs.close();
            stm.close();
            con.close();
        }catch (SQLException qw){
            System.out.println(qw.getMessage());
        }



    }
}
