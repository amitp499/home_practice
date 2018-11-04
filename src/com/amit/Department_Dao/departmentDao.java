package com.amit.Department_Dao;

import java.net.Inet4Address;
import java.sql.*;

public class departmentDao {

    Connection con = null;
    Statement stm = null;
    ResultSet rs = null;

    public  Connection getConnectDao()throws ClassNotFoundException, SQLException{

            //Class.forName("oracle.jdbc.OracleDriver");
        //Class.forName("oracle.jdbc.OracleDriver");
        Class.forName("oracle.jdbc.OracleDriver");

         con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe","hr","hr");
            //Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe","hr","hr");

        return con;
    }

    public Department serachByDeptId(Integer deptIds){

        try {
             con = getConnectDao();
             stm = con.createStatement();
             rs = stm.executeQuery("select * from departments where department_id="+deptIds);
            return parsedResultSet(rs);
        }catch (SQLException | ClassNotFoundException e){

            System.out.println(e.getMessage());
            return null;
        }

    }

    public Department parsedResultSet(ResultSet rs) throws SQLException{

       if (!rs.next()){

           return null;

       }else{

           Integer deptid = rs.getInt(1);
           String depName = rs.getString(2);
           Integer mid = rs.getInt(3);
           Integer lid = rs.getInt(3);

           Department dd = new Department(deptid, depName, mid, lid);

           rs.close();
           stm.close();
           con.close();
           return dd;
       }

    }
}


