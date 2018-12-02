package com.jp.entities;

public class Products {
	
	private String productName;
	private String productType;
	private String productId;
	private float productPrice;
	
	
	
	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Products(String productName, String productType, String productId, float productPrice) {
		super();
		this.productName = productName;
		this.productType = productType;
		this.productId = productId;
		this.productPrice = productPrice;
	}


	@Override
	public String toString() {
		return "Products [productName=" + productName + ", productType=" + productType + ", productId=" + productId
				+ ", productPrice=" + productPrice + "]";
	}
	
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}
	
	
	

}
