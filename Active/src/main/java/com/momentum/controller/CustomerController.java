package com.momentum.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.momentum.dao.CustomerRepository;
import com.momentum.model.Customer;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerRepository repository;

	@PostMapping("/saveCustomer")
	public String saveCustomer(@RequestBody Customer customer) {
		repository.save(customer);
		return "Customer saved successfully";
	}
	
	@GetMapping("/getAllCustomers")
	public List<Customer> getAll() {
		return repository.findAll();
	}
	

}

