package com.niit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.niit.dao.ProductDao;
import com.niit.models.Product;

//@Controller
public class ProductController {

	//@Autowired
	private ProductDao productDao;
	
	public ProductController()
	{
		
		System.out.println("ProductController Bean is Created");
		
	}
	
	public String getAllProducts(Model model)
	{
		List<Product> products=productDao.getAllProducts();
		
		model.addAttribute("productsList",products);
		return "productslist";
	}
	
}
