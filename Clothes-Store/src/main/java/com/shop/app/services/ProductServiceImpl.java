package com.shop.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shop.app.model.Product;
import com.shop.app.repository.ProductRepo;

@Service
@Transactional
public class ProductServiceImpl implements ProductServices {
	
	@Autowired
	ProductRepo productRepo;

	@Override
	public void addProduct(Product product) {
		
		
		productRepo.save(product);
	}

}
