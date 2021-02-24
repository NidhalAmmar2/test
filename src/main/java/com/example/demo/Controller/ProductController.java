package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Produit;

@RestController
@RequestMapping("/Products")
public class ProductController {
	
	
	@Autowired
	public com.example.demo.Service.ProductService  productService;
	
	@Configuration
	public static class Config{
		@Bean
		public com.example.demo.Service.ProductService ProductServiceController(){

		return new com.example.demo.Service.ProductService();
		}
	}
	
	
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	private List<Produit> getAllCategories()   
	{  
	
		return ProductService.getAllProducts();
		
	}  
	
	@GetMapping("/{Id}")  
	private Produit getProduct(@PathVariable("Id") int productId)   
	{  
		
		return ProductService.getProduitById(productId);
		
	}  
	
	@DeleteMapping("/{Id}")  
	private void deleteProduct(@PathVariable("Id") int productId)   
	{  
	
		ProductService.delete(productId);  
	}  
	
	
	
	@PostMapping  
	private int Save(@RequestBody Produit product)   
	{  
	
		ProductService.Save(product);  
	
		return 	product.getId();
		
	}  
	
	
	
	@PutMapping 
	private Produit update(@RequestBody Produit product)   
	{  
		
		ProductService.Save(product);
		
		return product;
		
	}  
	
	
	

}
