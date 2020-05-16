package com.springjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springjpa.domain.Product;


@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{
	
}
