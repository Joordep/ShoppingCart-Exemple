package com.example.demo.model;

import java.util.ArrayList;

public class ShoppingCart {
	
	
	ArrayList<CommerceItem> array;
	//BigDecimal amount;
	double amount;
	



	public ShoppingCart(ArrayList<CommerceItem> array, double amount) {
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

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
	
	
	
	

}
