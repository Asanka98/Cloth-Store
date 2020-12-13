package com.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("/home")
public class HomeController {
	
	@RequestMapping("/first")
	public String index() {
		
		
		return "first.html";
	}

}
