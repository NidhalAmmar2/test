package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.example.demo.Models.Produit;
@Component
@Primary
public class ProductService {


	@Autowired
	com.example.demo.Repository.ProductRepository ProductRepository;  
	
	
	public List<Produit> getAllProducts()   
	{  
		List<Produit> products = new ArrayList<Produit>();  
		ProductRepository.findAll().forEach(product -> products.add(product)); 
		
		return products;
		
	}  
	
	
	public Produit getProduitById(int id)   
	{  
	
		return ProductRepository.findById(id).get();
		
	}  
	
	
	public void Save(Produit product)   
	{  
	
		ProductRepository.save(product);
		
	}  
	
	
	
	public void delete(int id)   
	{  
		
		ProductRepository.deleteById(id);
		
	}  
	
	public void update(Produit produit, int ProductId)   
	{  
		
		ProductRepository.save(produit);
		
	}  
	
	
}
