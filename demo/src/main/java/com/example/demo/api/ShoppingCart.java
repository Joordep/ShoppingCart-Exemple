package com.example.demo.api;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.CommerceItem;
import com.example.demo.model.ShoppingCartModel;

@Controller
public class ShoppingCart {

	
	public Map<String, CommerceItem> shoppingcart = new HashMap<String, CommerceItem>();
	public int i=0;
	public CommerceItem ci = null;
	BigDecimal amountCart;
	
	ShoppingCartModel sc= new ShoppingCartModel(shoppingcart, amountCart);
	
	
	@PostMapping("/shoppingcart/items")
	public ResponseEntity<CommerceItem> addCommerceItem(@RequestParam(value="product_id")String product_id, 
										@RequestParam(value="quantity")int quantity, @RequestParam(value="price") double price){
		
	 
		double amount = quantity * price;
		
		//cria o commerce item
		ci = new CommerceItem(String.valueOf(i), product_id, quantity, BigDecimal.valueOf(amount));
		i++;
		shoppingcart.put(ci.getId(), ci);
		

		sc.setArray(shoppingcart);
		sc.setAmount(BigDecimal.valueOf(amount));
	

		return new ResponseEntity<CommerceItem>(HttpStatus.OK);
				
	}
	
	@GetMapping(value = "/shoppingcart")
	public ResponseEntity<List<CommerceItem>> listar (){
		
//		return new ResponseEntity<List<ShoppingCartModel>>(sc.HttpStatus.OK);
		return new ResponseEntity<List<CommerceItem>>(new ArrayList<CommerceItem>(shoppingcart.values()), HttpStatus.OK);
		
	}
	
	@DeleteMapping("/shoppingcart/items/{id}")
	public ResponseEntity<?> shoppingcartItemIdDelete(@PathVariable("id") String id) {
		
		shoppingcart.remove(id);		
		
		return new ResponseEntity<>(HttpStatus.OK);		
	}
}
