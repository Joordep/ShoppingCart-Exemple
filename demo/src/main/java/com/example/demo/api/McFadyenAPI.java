package com.example.demo.api;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
//@SpringBootApplication(scanBasePackages={"com.example.demo.model.CommerceItem",
//"com.example.demo.model.Product", "com.example.demo.model.ShoppingCart",
//"com.example.demo.service.ShoppinCartService)"})

public class McFadyenAPI {

//	@RequestMapping("/namorada")
//	@ResponseBody
//	String home(){
//		return "teste som ";
//	}

//	@GetMapping("/products")
//	public List<Product> productsGet(){
//		return new ArrayList<Product>();
//	}
	
//	@GetMapping("/shoppingcart")
//	public ShoppingCart shoppingcartGet(){
//		
//		return new ShoppingCart();
//	}
//	
//	@DeleteMapping("/shoppingcart/items/{id}")
//	//public void shoppingcartItemIdDelete(@PathParam("id") String id) {
//	public void shoppingcartItemIdDelete(@PathVariable ("id") String id) {
//		
//		
//	}
//	
//	@PostMapping("/shoppingcart/items")
//	public CommerceItem shoppingcartItemsPost(){
//		
//		return new CommerceItem(null, null, 0, null);
//	}
	
	
	public static void main(String[] args) throws Exception{
		SpringApplication.run(McFadyenAPI.class, args);
	}
}
