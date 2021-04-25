package com.momentum.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.momentum.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
