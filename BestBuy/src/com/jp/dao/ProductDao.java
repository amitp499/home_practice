package com.jp.dao;

import java.util.ArrayList;

import com.jp.entities.Products;
import com.jp.exceptions.ProductException;

public interface ProductDao {
	
	public ArrayList<Products> getProductList() throws ProductException;
	public Products getSelectProductDetails();

}
