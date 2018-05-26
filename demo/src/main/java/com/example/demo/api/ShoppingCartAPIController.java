package com.example.demo.api;

import java.math.BigDecimal;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.CommerceItem;
import com.example.demo.model.Product;
import com.example.demo.model.ShoppingCart;

@RestController
public class ShoppingCartAPIController {

	@Autowired
	private ShoppingCartService shoppingCartAPIService;
	
	public ShoppingCartAPIController(ShoppingCartService shoppingCartService)
	{
		this.shoppingCartAPIService=shoppingCartService;
	}

	
	@GetMapping("/products")
	public Map<Integer, Product> getproducts()
	{	
		return shoppingCartAPIService.getproducts();
	}
	
	@GetMapping("/shoppingcart")
	public ShoppingCart shoppingcartGet()
	{
		return shoppingCartAPIService.shoppingcartGet();
	}
	
	@PostMapping("/shoppingcart/items")
	public CommerceItem shooppingcartPost(@RequestParam("product_id") String product_id,
			@RequestParam("quantity") Integer quantity, @RequestParam("price") BigDecimal price){	
			
		return shoppingCartAPIService.shoppingcartPost(product_id, quantity, price); 			
	}
			

	@DeleteMapping("/shoppingcart/items/{id}")
	public void shoppingcartItemIdDelete(@PathVariable("id") String id) {

		shoppingCartAPIService.shoppingcartItemsIdDelete(id);
	}
}
