package com.shop.app.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.shop.app.model.User;
import com.shop.app.repository.UserRepository;

public class UserServicesImplementation implements UserServices {
	
	@Autowired
	UserRepository userRepo;

	@Override
	public void addUser(User user) {
		
		
		userRepo.save(user);
	}
	
	
		
		
	

}
