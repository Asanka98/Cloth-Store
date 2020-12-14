package com.shop.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.shop.app.model.Product;

@Repository
public interface ProductRepo extends CrudRepository< Product , Integer > {
	
	

}
