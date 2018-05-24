package com.example.demo.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.Product;


@Controller
public class ProdutoResource {
	
	private Map<Integer, Product> products;
	public ProdutoResource(){
	
		products = new HashMap<Integer, Product>();
		
		Product p1 = new Product("SKU01", "DVD - AVENGERS", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTukUCyKaFTv5c6cnWI_a99tqqhCM-zpF2IZEcDmW_6kgT22HBhr62y30Y", 45.10);
		Product p2 = new Product("SKU02", "Rocket League", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTukUCyKaFTv5c6cnWI_a99tqqhCM-zpF2IZEcDmW_6kgT22HBhr62y30Y", 30.50);
		Product p3 = new Product("SKU03", "Battlefield 4", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSdZEUJfijo8UMdRPvDptQ67vRomlmkrx10TwgdV-fwpPa-O_XysDHXQNWvQg", 15.11);
		Product p4 = new Product("SKU04", "DVD - Amado Batista", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTukUCyKaFTv5c6cnWI_a99tqqhCM-zpF2IZEcDmW_6kgT22HBhr62y30Y", 100.10);
		
		products.put(1,p1);
		products.put(2,p2);
		products.put(3,p3);
		products.put(4,p4);				
		
	}
	
	public Map<Integer, Product> getproducts() {
		return products;
	}

	public void setproducts(Map<Integer, Product> products) {
		this.products = products;
	}

	@GetMapping(value = "/products")
	public ResponseEntity<List<Product>> listar (){	
		return new ResponseEntity<List<Product>>(new ArrayList<Product>(products.values()), HttpStatus.OK);
		
	}
	
}

