package com.example.demo.api;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.CommerceItem;
import com.example.demo.model.Product;
import com.example.demo.model.ShoppingCart;

@Controller
public class ShoppingCartAPIController {
	
	@Value("${spring.application.name}")
	String appName;
	
	@Autowired
	private ShoppingCartService shoppingCartAPIService;

	public ShoppingCartAPIController(ShoppingCartService shoppingCartService) {
		this.shoppingCartAPIService = shoppingCartService;
	}
	
	@GetMapping("/")
	public String homePage(Model model){
		model.addAttribute("appName", appName);
		
		return "home";
	}
	
	@GetMapping("/products")
	public String productsPage(Model model){
		
		Map<Integer, Product> lista = new HashMap<>();  
		lista = shoppingCartAPIService.getproducts();
 		
		model.addAttribute("lista", lista);
		
		return "products";
	}

	@GetMapping("/shoppingcart")
	public String shoppingcartGet(Model model) { 
		
		ShoppingCart sc = shoppingCartAPIService.shoppingcartGet();
		
		model.addAttribute("sc", sc);
		
		return "shoppingcart";
	}


	@PostMapping("/shoppingcart/items")
	public String shooppingcartPost(Model model, @RequestParam("product_id") String product_id,
			@RequestParam("quantity") Integer quantity, @RequestParam("price") BigDecimal price) {
		
		CommerceItem ci = shoppingCartAPIService.shoppingcartPost(product_id, quantity, price);
		model.addAttribute("ci", ci);

		return "redirect:/shoppingcart";
	}
	
	@DeleteMapping("/shoppingcart/items/{id}")
	public String shoppingcartItemIdDelete(Model model, @PathVariable("id") String id) {

		shoppingCartAPIService.shoppingcartItemsIdDelete(id);
		
		return "redirect:/shoppingcart";
	}
	

//	@DeleteMapping("/shoppingcart/items/{id}")
//	public void shoppingcartItemIdDelete(@PathVariable("id") String id) {
//
//		shoppingCartAPIService.shoppingcartItemsIdDelete(id);
//	}
}
