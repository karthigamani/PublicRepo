package com.springjpa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springjpa.domain.Config;
import com.springjpa.domain.Product;
import com.springjpa.repository.ConfigRepository;
import com.springjpa.repository.ProductRepository;

@RestController
@RequestMapping("/api")
public class ResourceController {
	
	@Autowired
	ConfigRepository configRepository;
	
	@Autowired
	ProductRepository productRepository;
	
	@GetMapping("/getproductdetails")
	List<Product> getproductdetails () {
		return productRepository.findAll();
	}
	
	@GetMapping("/getconfigdetails")
	List<Config> getconfigdetails() {
		return configRepository.findAll();
	}
	
}
