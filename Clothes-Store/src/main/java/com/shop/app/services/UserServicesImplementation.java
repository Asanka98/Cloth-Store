package com.shop.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.app.model.User;
import com.shop.app.repository.UserRepository;

@Service
public class UserServicesImplementation implements UserServices {
	
	@Autowired
	UserRepository userRepo;

	@Override
	public void addUser(User user) {
		
		
		userRepo.save(user);
	}
	
	
		
		
	

}
