package com.shop.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Controller
@RequestMapping(value="/home")
public class HomeController {
	
	@RequestMapping(value="/first")
	public String index() {
		
		System.out.println("hello world");
		return "add";
	}

}
