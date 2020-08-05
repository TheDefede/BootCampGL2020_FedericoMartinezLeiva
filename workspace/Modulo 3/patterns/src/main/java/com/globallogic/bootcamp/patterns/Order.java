package com.globallogic.bootcamp.patterns;


public class Order {
	
	private String description;
	private int count;
	private Currency theCurrency;
	private Product product;
	
	public Order() {
		this.description = "some descrpition";
		this.count = 5;
		this.theCurrency = Currency.getInstance();
		this.product = Product.getInstance();
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Currency getTheCurrency() {
		return theCurrency;
	}

	public void setTheCurrency(Currency theCurrency) {
		this.theCurrency = theCurrency;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}
