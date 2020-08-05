package com.globallogic.bootcamp.patterns;

public class Product {
	
	private static final Product INSTANCE = new Product();
	
	String name;
	
	public static Product getInstance() {
		return INSTANCE;
	}
	
	public Product() {
		this.name = "Clavos";
	}

}
