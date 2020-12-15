package com.shop.app.controller;

import org.eclipse.jdt.internal.compiler.apt.util.ModuleLocationHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shop.app.model.User;
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
 public String register(Model model) {
	 
	 User newuser = new User();
		
	 model.addAttribute("newuser",newuser);
		
 return "register";
	
 }
 
 
 @PostMapping(value="/adduser")
 public String addUser(@ModelAttribute  User newuser, Model model) {
		
	 System.out.println(newuser.toString());
		
	 services.addUser(newuser);
	 
	 Model m = model.addAttribute("newuser",newuser);
 
	 return register(m);
 }
 
 
 
 
}
