package com.shop.repo;

import org.springframework.data.repository.CrudRepository;

import com.shop.model.Product;


public interface ProductRepo extends CrudRepository< Product , Integer > {
	
	

}
