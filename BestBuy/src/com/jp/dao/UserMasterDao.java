package com.jp.dao;

import com.jp.entities.UserMaster;
import com.jp.exceptions.ProductException;

public interface UserMasterDao {
	
	public UserMaster validateUserCredentials(String userId) throws ProductException;
		


}
