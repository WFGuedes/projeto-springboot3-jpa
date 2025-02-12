package com.guedes.aula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guedes.aula.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
