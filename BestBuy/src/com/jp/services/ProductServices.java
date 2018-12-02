package com.jp.services;

import java.util.ArrayList;

import com.jp.entities.Products;
import com.jp.entities.UserMaster;
import com.jp.exceptions.ProductException;

public interface ProductServices {
	
	public ArrayList<Products> displayProductList() throws ProductException;
	
	public UserMaster validateUserCredentials(String userId, String password) throws ProductException;

}
