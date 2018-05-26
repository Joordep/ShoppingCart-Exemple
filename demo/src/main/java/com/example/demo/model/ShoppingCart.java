package com.example.demo.model;

import java.math.BigDecimal;
import java.util.ArrayList;

public class ShoppingCart {
	
	
	ArrayList<CommerceItem> array;
	BigDecimal amount = new BigDecimal("0.0");

	public ShoppingCart(ArrayList<CommerceItem> array, BigDecimal amount) {
		super();
		this.array = array;
		this.amount = amount;
	}

	public ArrayList<CommerceItem> getArray() {
		return array;
	}

	public void setArray(ArrayList<CommerceItem> array) {
		this.array = array;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	
}
