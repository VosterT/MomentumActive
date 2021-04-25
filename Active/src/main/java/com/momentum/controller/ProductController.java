package com.momentum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.momentum.dao.ProductRepository;
import com.momentum.model.Product;

public class ProductController {

	@Autowired
	private ProductRepository repository;

	@PostMapping("/saveProduct")
	public String saveProduct(@RequestBody Product products) {
		repository.save(products);
		return "Product saved successfully";
	}
	
	@GetMapping("/getAllProduct")
	public List<Product> getAll() {
		return repository.findAll();
	}
	
}
