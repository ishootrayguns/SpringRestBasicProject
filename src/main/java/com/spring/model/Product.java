package com.spring.model;


public class Product {
	private int productNo;
	private String productName;
	private String category;
	private int price;
	
	public Product() {
		
	}

	public Product(int productNo, String productName, String category, int price) {
		super();
		this.productNo = productNo;
		this.productName = productName;
		this.category = category;
		this.price = price;
	}

	public int getProductNo() {
		return productNo;
	}

	public void setProductNo(int productNo) {
		this.productNo = productNo;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [productNo=" + productNo + ", productName=" + productName + ", category=" + category
				+ ", price=" + price + "]";
	}
	
}
