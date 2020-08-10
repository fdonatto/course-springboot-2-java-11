package com.fdsoftware.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fdsoftware.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
	

}
