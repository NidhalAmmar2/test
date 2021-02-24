package com.example.demo.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Produit")
public class Produit {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id ; 
	
	@Column(name="name")
	private String name ; 
	
	@Column(name="Description")
	private String Description ; 
	
	@ManyToOne 
	Categorie categorie;
	
	
	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getProductName() {
		return name;
	}

	public void setProductName(String productName) {
		name = productName;
	}


	public Produit() {
	}
	
	
	
}
