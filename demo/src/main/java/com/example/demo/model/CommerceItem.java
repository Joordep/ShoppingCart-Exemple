package com.example.demo.model;

public class CommerceItem {
	
	String id;
	String product_id;
	int quantity;
	double amount;
	//BigDecimal amount;
	
	
	//public CommerceItem(String id, String product_id, int quantity, BigDecimal amount) {
//		super();
//		this.id = id;
//		this.product_id = product_id;
//		this.quantity = quantity;
//		this.amount = amount;
//	}
	
	public CommerceItem(String id, String product_id, int quantity, double amount) {
		super();
		this.id = id;
		this.product_id = product_id;
		this.quantity = quantity;
		this.amount = amount;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	public String getProduct_id() {
		return product_id;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	
	
	

}
