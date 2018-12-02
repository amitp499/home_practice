package com.jp.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jp.entities.UserMaster;
import com.jp.exceptions.ProductException;

import co.jp.utility.ConnectionFactory;
import oracle.jdbc.pool.OracleDataSource;

public class UserMasterDaoImpl implements UserMasterDao {
	
	private ConnectionFactory factory;
	private ResultSet rs;
	private Connection con;
	private Statement stmt;
	private OracleDataSource dataSource;
	
	
public UserMasterDaoImpl() throws ProductException {
		
		try {
			
			factory = ConnectionFactory.getInstance();
			dataSource = factory.getDataSource();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new ProductException("Error in creating connection pool object",e);
		}
		
	}

	@Override
	public UserMaster validateUserCredentials(String userId) throws ProductException {
		
		String qry = "Select userid , userpassword , userrole from usermaster where userid='"+userId+"'";
		
		try {
			
			con = dataSource.getConnection();
			stmt = con.createStatement();
			rs=stmt.executeQuery(qry);
			
			if (rs.next()) {
				
				String userid = rs.getString("userid");
				String userpass = rs.getString("userpassword");
				String userrole = rs.getString("userrole");
				
				return new UserMaster(userid, userpass, userrole );
			}
			
		} catch (SQLException e) {
			
			throw new ProductException("Error in fetching user details", e);
		}
		
		return null;
	}

}
