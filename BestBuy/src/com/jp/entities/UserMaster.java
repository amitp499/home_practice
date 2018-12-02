package com.jp.entities;

public class UserMaster {
	
	private String userId;
	private String userPassword;
	private String userRole;
	
	
	public UserMaster() {
		super();
		// TODO Auto-generated constructor stub
	}


	public UserMaster(String userId, String userPassword, String userRole) {
		super();
		this.userId = userId;
		this.userPassword = userPassword;
		this.userRole = userRole;
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getUserPassword() {
		return userPassword;
	}


	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}


	public String getUserRole() {
		return userRole;
	}


	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}


	@Override
	public String toString() {
		return "UserMaster [userId=" + userId + ", userPassword=" + userPassword + ", userRole=" + userRole + "]";
	}
	
	
	
	
	

}
