package com.fdsoftware.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fdsoftware.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	

}
