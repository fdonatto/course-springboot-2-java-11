package com.fdsoftware.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fdsoftware.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	

}
