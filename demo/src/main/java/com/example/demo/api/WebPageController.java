package com.example.demo.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

@Controller
public class WebPageController {
 
	@Value("${spring.application.name}")
	String appName;
//	
//	@GetMapping("/")
//	public String homePage(Model model){
//		model.addAttribute("appName", appName);
//		
//		return "home";
//	}
	
//	@GetMapping("/produtos")
//	public String productsPage(Model model){
//		
////		Map<Integer, Product> lista = shoppingCartAPIService.getproducts();
// 		
//		model.addAttribute("appName", appName);
//		
//		return "productList";
//	}
	
}
