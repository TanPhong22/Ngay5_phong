package com.Ngay3.Ngay3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Ngay3.Ngay3.model.Product;
import com.Ngay3.Ngay3.service.ProductService;

import org.springframework.ui.Model;

@Controller
public class ProductController {
	@Autowired
	private ProductService services;
	@RequestMapping("/")
	public String Home(Model model) {
		List<Product> ListProducts = services.findAll();
		model.addAttribute("Products",ListProducts);
		return "index";
	}
}
