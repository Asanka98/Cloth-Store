package com.shop.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.shop.app.model.Product;
import com.shop.app.services.ProductServices;


@Controller
@RequestMapping(value="/inventory")
public class InventoryController {
	
	
	
	@Autowired
	ProductServices productService;
	
	@RequestMapping(path="/addproductpage")
	public String addproductpage(Model model) {
		
		Product product = new Product();
	    model.addAttribute("product", product);
		
		return "addProduct";
	}
	
	@PostMapping("/addproduct")
	public String addingProduct(@ModelAttribute Product product , BindingResult bindingResult) {
		
		if (bindingResult.hasErrors()) {
	        System.out.println("error");
	    }  
		
		productService.addProduct(product);
		
		System.out.println(product.toString());
		
		return "addProduct";
	}
	
	

}
