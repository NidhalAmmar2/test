package com.example.demo.Models;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Categorie")
public class Categorie {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id ; 
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public List<Produit> getProducts() {
		return products;
	}

	public void setProducts(List<Produit> products) {
		this.products = products;
	}



	@Column(name="Name")
	private String Name ; 
	
	@Column(name="date")
	private Timestamp date  ; 
	
	@OneToMany
	List<Produit> products ;
	

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getCatName() {
		return Name;
	}

	public void setCatName(String catName) {
		Name = catName;
	}

	public Timestamp getDate() {
		return date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	

	public Categorie() {
	}
	
	
	
	
}
