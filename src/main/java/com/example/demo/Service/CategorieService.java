package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.example.demo.Models.Categorie;
import com.example.demo.Repository.*;
import com.sun.el.stream.Optional;

@Component
@Primary
public class CategorieService {

	@Autowired
	CategorieRepository CategorieRepository;  
	
	
	public List<Categorie> getAllCategories()   
	{  
		List<Categorie> categories = new ArrayList<Categorie>();  
		CategorieRepository.findAll().forEach(categorie -> categories.add(categorie)); 
		
		return categories;
		
	}  
	
	
	public Categorie getCategorieById(int id)   
	{  
	
		return CategorieRepository.findById(id).get();
		
	}  
	
	
	public void Save(Categorie cat)   
	{  
		java.util.Optional<Categorie> categorie = CategorieRepository.findById(cat.getId());
		
		categorie.ifPresent(categ -> {
			
		System.out.println("jbcjdbdhjcbdjsbcdhj");
			
			categ.setDate(cat.getDate());
			categ.setCatName(cat.getCatName());
			CategorieRepository.save(categ);
			
		} );
		
	}  
	
	
	
	public void delete(int id)   
	{  
		
		CategorieRepository.deleteById(id);
		
	}  
	
	public void update(Categorie cat, int CatId)   
	{  
		
		CategorieRepository.save(cat);
		
	}  
	
	
	
}
