package com.example.demo.api;


import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.demo.model.CommerceItem;
import com.example.demo.model.Product;
import com.example.demo.model.ShoppingCart;


@Service
public class ShoppingCartService {
	
	public static ArrayList<CommerceItem> commerceitems = new ArrayList<>();
	public static ShoppingCart sc = new ShoppingCart(commerceitems, 0);
	
	public static Map<Integer, Product> shoproducts = new HashMap<Integer, Product>(); 
	
	static
	{		
		//shopping products
		Product p1 = new Product("SKU01", "DVD - AVENGERS",
				"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTukUCyKaFTv5c6cnWI_a99tqqhCM-zpF2IZEcDmW_6kgT22HBhr62y30Y",
				45.10);
		Product p2 = new Product("SKU02", "Rocket League",
				"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTukUCyKaFTv5c6cnWI_a99tqqhCM-zpF2IZEcDmW_6kgT22HBhr62y30Y",
				30.50);
		Product p3 = new Product("SKU03", "Battlefield 4",
				"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSdZEUJfijo8UMdRPvDptQ67vRomlmkrx10TwgdV-fwpPa-O_XysDHXQNWvQg",
				15.11);
		Product p4 = new Product("SKU04", "DVD - Amado Batista",
				"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTukUCyKaFTv5c6cnWI_a99tqqhCM-zpF2IZEcDmW_6kgT22HBhr62y30Y",
				100.10);
		
		shoproducts.put(1, p1);
		shoproducts.put(2, p2);
		shoproducts.put(3, p3);
		shoproducts.put(4, p4);
		
	}
	
	
	public ShoppingCart shoppingcartGet()
	{	
		return sc;
	}

	public Map<Integer, Product> getproducts() {
		return shoproducts;
	}
	
	private SecureRandom random = new SecureRandom();
	public CommerceItem shoppingcartPost(String product_id, Integer quantity, double price)
	{		
		String randomId = new BigInteger(130, random).toString();
		double amountCI = quantity * price;
		
		CommerceItem ci = new CommerceItem(randomId,product_id, quantity, amountCI);
		commerceitems.add(ci);
		
		sc.setArray(commerceitems);
		
		sc.setAmount(calculaValortotal(commerceitems));
		
		return ci;	
	}
	
	private double calculaValortotal(ArrayList<CommerceItem> commerceitems) {
		double totalAmount=0;
		for(CommerceItem c : commerceitems){
			totalAmount+=c.getAmount();
		}
		
		return totalAmount;
	}

	public void shoppingcartItemsIdDelete(String id)
	{
		
		
	}
	
}
