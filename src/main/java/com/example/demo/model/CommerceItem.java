package com.example.demo.model;

import java.math.BigDecimal;

public class CommerceItem {

	String id;
	String product_id;
	int quantity;
	BigDecimal amount = new BigDecimal("0.0");
	
	
	public CommerceItem(String id, String product_id, int quantity, BigDecimal amount) {
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

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getAmount() {
		return amount;
	}
}
