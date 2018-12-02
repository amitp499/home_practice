package com.jp.services;

import java.util.ArrayList;

import com.jp.dao.ProductDao;
import com.jp.dao.ProductDaoImpl;
import com.jp.dao.UserMasterDao;
import com.jp.dao.UserMasterDaoImpl;
import com.jp.entities.Products;
import com.jp.entities.UserMaster;
import com.jp.exceptions.ProductException;

public class ProductServicesImpl implements ProductServices{
	
	private ProductDao productDb;
	private UserMasterDao usertDb;
	
	public ProductServicesImpl() throws ProductException {
		
		productDb = new ProductDaoImpl();
		usertDb = new UserMasterDaoImpl();
	}

	@Override
	public ArrayList<Products> displayProductList() throws ProductException {
	
		return productDb.getProductList();
	}

	
	public UserMaster validateUserCredentials(String userId, String password) throws ProductException {
		
		UserMaster um = usertDb.validateUserCredentials(userId);
		
		if (password.equals(um.getUserPassword())) {
			
			return um;
		}
		
		return null;
	}
	
	

}
