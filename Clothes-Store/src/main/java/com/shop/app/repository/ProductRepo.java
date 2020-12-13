package com.shop.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.shop.app.model.Product;


public interface ProductRepo extends CrudRepository< Product , Integer > {
	
	

}
