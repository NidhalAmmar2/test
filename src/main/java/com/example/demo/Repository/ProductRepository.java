package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Models.Produit;


public interface ProductRepository extends CrudRepository<Produit, Integer>{

}
