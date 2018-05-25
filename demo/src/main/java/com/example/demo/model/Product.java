package com.example.demo.model;

public class Product {
		
	String id;
	String name;
	String image;
//	BigDecimal price;
	double price;
	
	// mudar 
	public Product(String id, String name, String image, double price) {
		super();
		this.id = id;
		this.name = name;
		this.image = image;
		this.price = price;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
		
	}


	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
//	public BigDecimal getPrice() {
//		return price;
//	}
//	public void setPrice(BigDecimal price) {
//		this.price = price;
//	}
	
	
	
	
}
