package com.ClassRoom_23_Oct_2018.HrmsApplication;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class EmployeeImp implements empInterface {

    static File file = new File("D:\\emp");

    String eidFound="False";
    String efirstName="False";

    static {
        // file = new File("D:\\emp");
        try {
            if (file.exists()) {
                System.out.println("EMPLOYEE DATA SOURCE FILE LOADED");
            } else {
                System.out.println("EMPLOYEE DATA FILE NOT FOUND.. CREATING EMPLOYEE DATA FILE..");
                file.createNewFile();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void ListAllEmployees() {
        File file = new File("D:\\emp");
        try {
            FileInputStream in = new FileInputStream(file);
            ObjectInputStream inObj = new ObjectInputStream(in);
            Object emp = inObj.readObject();
           // System.out.println(emp);
            //ArrayList<Employee>
            ArrayList<Employee> employeesList = (ArrayList<Employee>) emp;

            if (!employeesList.isEmpty()) {
                for (Employee e : employeesList) {

                    System.out.println(e);
                }
            }else{
                System.out.println("No records found to display");
            }

        } catch (Exception e) {
           System.out.println(e.getMessage());
        }
    }

    public Employee findById(int empid) {
        File file = new File("D:\\emp");

        try {
            FileInputStream in = new FileInputStream(file);
            ObjectInputStream inObj = new ObjectInputStream(in);
            Object emp = inObj.readObject();
            //System.out.println(emp);
            //ArrayList<Employee>
            ArrayList<Employee> employeesList = (ArrayList<Employee>) emp;

            for (Employee b : employeesList) {
                if (b.getEmpId() == empid) {
                     eidFound = "True";
                    return b;
                }
            }



        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return null;




       /* for (Employee b : empList) {
            if (b.getEmpId() == empid) {
                return b;
            }
        }*/

    }


    public List<Employee> findByfirstName(String firstName) {

        File file = new File("D:\\emp");

        try {
            FileInputStream in = new FileInputStream(file);
            ObjectInputStream inObj = new ObjectInputStream(in);
            Object emp = inObj.readObject();
           // System.out.println("actuat"+emp);
            //ArrayList<Employee>
            ArrayList<Employee> employeesList = (ArrayList<Employee>) emp;
            List<Employee> temp = new ArrayList<>();

            for (Employee c : employeesList) {
                //System.out.println("yes");
                if (c.getFirstName().equalsIgnoreCase(firstName)) {
                    efirstName = "True";
                    temp.add(c);
                    return temp;
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return null;

    }


    ArrayList<Employee> empList = new ArrayList<>();

    @Override
    public void add(Employee emp) {
        try {


            empList.add(emp);

           // FileOutputStream in = new FileOutputStream(emp,1);

            FileOutputStream in = new FileOutputStream(file);
            ObjectOutputStream objout = new ObjectOutputStream(in);
           //OutputStreamWriter objout = new OutputStreamWriter(in);

           // BufferedWriter bw = new BufferedWriter(objout);




            objout.writeObject(empList);


            objout.close();
            in.close();

        } catch (IOException e) {

            System.out.println(e.getMessage());
        }

        // empList.add(emp);
    }


    public Employee findById_Old(int empid) {
        for (Employee b : empList) {
            if (b.getEmpId() == empid) {
                return b;
            }
        }
        return null;
    }


    public List<Employee> findByfirstName_Old(String firstName) {
        List<Employee> temp = null;
        temp = new ArrayList<>();
        if (!empList.isEmpty()) {

            for (Employee b : empList) {

                if (b.getFirstName().toLowerCase().contains(firstName.toLowerCase())) {
                    temp.add(b);
                }
            }

        } else {
            System.out.println("No Record found");

        }
        return temp;

    }

}
