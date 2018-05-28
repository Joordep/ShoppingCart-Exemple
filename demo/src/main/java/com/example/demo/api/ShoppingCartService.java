package com.example.demo.api;


import java.math.BigDecimal;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.demo.model.CommerceItem;
import com.example.demo.model.Product;
import com.example.demo.model.ShoppingCart;


@Service
public class ShoppingCartService {
	
	public static ArrayList<CommerceItem> commerceitems = new ArrayList<>();
	
	static BigDecimal scamount = new BigDecimal("0.0");
	public static ShoppingCart sc = new ShoppingCart(commerceitems, scamount);
	
	public static Map<Integer, Product> shoproducts = new HashMap<Integer, Product>(); 
	
	static
	{		

		BigDecimal big1 = new BigDecimal("45.10");
		BigDecimal big2 = new BigDecimal("30.50");
		BigDecimal big3 = new BigDecimal("15.11");
		BigDecimal big4 = new BigDecimal("100.10");
		
		
		Product p1 = new Product("SKU01", "DVD - AVENGERS",
				"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTukUCyKaFTv5c6cnWI_a99tqqhCM-zpF2IZEcDmW_6kgT22HBhr62y30Y",
				big1);
		Product p2 = new Product("SKU02", "Rocket League",
				"https://images-na.ssl-images-amazon.com/images/I/81LXUOTmcGL._SX342_.jpg",
				big2);
		Product p3 = new Product("SKU03", "Battlefield 4",
				"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSdZEUJfijo8UMdRPvDptQ67vRomlmkrx10TwgdV-fwpPa-O_XysDHXQNWvQg",
				big3);
		Product p4 = new Product("SKU04", "DVD - Amado Batista",
				"https://www.kboing.com.br/fotos/imagens/4999664795bca.jpg",
				big4);
		
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
	public CommerceItem shoppingcartPost(String product_id, Integer quantity, BigDecimal price)
	{	
		
		String randomId = new BigInteger(10, random).toString();
		
		BigDecimal amountCI = new BigDecimal("0.0");
	
		amountCI = price.multiply(new BigDecimal(quantity));
		
		CommerceItem ci = new CommerceItem(randomId,product_id, quantity, amountCI);
		commerceitems.add(ci);
		
		updateShoppingCart(commerceitems);
		
		
		return ci;	
	}
	
	
	private BigDecimal calculaValortotal(ArrayList<CommerceItem> commerceitems) {
		
		BigDecimal totalAmount= new BigDecimal("0.0");
		
		for(CommerceItem c : commerceitems){
			totalAmount = totalAmount.add(c.getAmount()) ;
		}		
		return totalAmount;
	}

	public void shoppingcartItemsIdDelete(String id)
	{
		
		Iterator<CommerceItem> it = commerceitems.iterator();
		while(it.hasNext())
		{
			CommerceItem teste = it.next();
			if(teste.getId().equals(id))
				it.remove();
		}

		updateShoppingCart(commerceitems);
		
	}

	private void updateShoppingCart(ArrayList<CommerceItem> commerceitems2) {
		
		sc.setArray(commerceitems);
		sc.setAmount(calculaValortotal(commerceitems));
		
	}
	
}
