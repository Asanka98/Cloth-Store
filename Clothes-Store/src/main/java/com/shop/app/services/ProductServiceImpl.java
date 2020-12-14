package com.shop.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.app.model.Product;
import com.shop.app.repository.ProductRepo;

@Service
public class ProductServiceImpl implements ProductServices {
	
	@Autowired
	ProductRepo productRepo;

	@Override
	public void addProduct(Product product) {
		
		
		productRepo.save(product);
	}

}
