package com.spring.ListSum;

import java.util.List;

public class Product {
	private String productName;
	private List<Integer> price;

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public List<Integer> getPrice() {
		return price;
	}

	public void setPrice(List<Integer> price) {
		this.price = price;
	}

	public Product(String productName, List<Integer> price) {
		super();
		this.productName = productName;
		this.price = price;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

}
