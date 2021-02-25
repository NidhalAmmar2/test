package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Categorie;


@RestController
@RequestMapping("/Categories")
public class CategorieController {
	
	@Autowired
	public com.example.demo.Service.CategorieService CategorieService;
	
	
	@Configuration
	public static class Config{
		@Bean
		public com.example.demo.Service.CategorieService CategorieServiceController(){

		return new com.example.demo.Service.CategorieService();
		}
	}

	
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	private List<Categorie> getAllCategories()   
	{  
	
		return CategorieService.getAllCategories();
		
	}  
	
	
	@GetMapping("/{Id}")  
	private Categorie getBooks(@PathVariable("Id") int catId)   
	{  

		System.out.println(catId);
		return CategorieService.getCategorieById(catId);
		
	}  
	
	@DeleteMapping("/{Id}")  
	private void deleteBook(@PathVariable("Id") int catId)   
	{  
	
		CategorieService.delete(catId);  
	}  
	
	
	
	@RequestMapping(method = RequestMethod.POST)
	private int saveBook(@RequestBody Categorie categorie)   
	{  
	
		CategorieService.Save(categorie);  
	
		return 	categorie.getId();
		
	}  
	
	
	
	@PutMapping 
	private Categorie update(@RequestBody Categorie categorie)   
	{  
		
		CategorieService.Save(categorie);
		
		return categorie;
		
	}  
	
}
