package com.example.demo.model;

import java.math.BigDecimal;
import java.util.Map;

public class ShoppingCartModel {
	
	
	Map<String, CommerceItem> array;
	BigDecimal amount;
	
	
	public ShoppingCartModel(Map<String, CommerceItem> array, BigDecimal amount) {
		super();
		this.array = array;
		this.amount = amount;
	}
	
	
	public Map<String, CommerceItem> getArray() {
		return array;
	}
	public void setArray(Map<String, CommerceItem> array) {
		this.array = array;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	
	
	
	

}
