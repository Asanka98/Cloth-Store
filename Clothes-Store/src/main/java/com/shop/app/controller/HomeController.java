package com.shop.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shop.app.services.UserServices;

@Controller
@RequestMapping(value="/user")
public class HomeController {
	
	@Autowired
	UserServices services;

 @RequestMapping(value="/home")
  public String home() {

	 return "home";
  
  }
 
 @RequestMapping(value="/login")
 public String login() {

	 
 return "login";
 
 }

 
 @RequestMapping(value="/profile")
 public String profile() {
		
		
 return "profile";
	
 }
 
 @RequestMapping(value="/register")
 public String register() {
		
		
 return "register";
	
 }
 
 
 
 
}
