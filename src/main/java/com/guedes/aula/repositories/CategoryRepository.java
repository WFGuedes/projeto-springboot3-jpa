package com.guedes.aula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guedes.aula.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
