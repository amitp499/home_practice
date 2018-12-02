package com.jp.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.jp.entities.Products;
import com.jp.exceptions.ProductException;

import co.jp.utility.ConnectionFactory;
import oracle.jdbc.pool.OracleDataSource;

public class ProductDaoImpl implements ProductDao{
	
	private ConnectionFactory factory;
	private ResultSet rs;
	private Connection con;
	private Statement stmt;
	private OracleDataSource dataSource;
	
	
	public ProductDaoImpl() throws ProductException {
		
		try {
			
			factory = ConnectionFactory.getInstance();
			dataSource = factory.getDataSource();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new ProductException("Error in creating connection pool object",e);
		}
		
	}


	@Override
	public ArrayList<Products> getProductList() throws ProductException{
		
		ArrayList<Products> prdList = new ArrayList<>();
		
		try {
			
			String qry = "Select productname , productid , producttype , productprice from product";
			
			
			con = dataSource.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery(qry);
			
			while(rs.next()) {
				
				String productName = rs.getString("productname");
				String productId = rs.getString("productid");
				String productType= rs.getString("producttype");
				float productPrice = rs.getFloat("productprice");
				
				prdList.add(new Products(productName, productType, productId,  productPrice));
			}
			
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new ProductException("Error in fetching product list", e);
		}
		
		return prdList;
	}


	@Override
	public Products getSelectProductDetails() {
		// TODO Auto-generated method stub
		return null;
	}

}
