package com.guedes.aula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guedes.aula.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
