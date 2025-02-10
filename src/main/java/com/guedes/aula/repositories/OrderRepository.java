package com.guedes.aula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guedes.aula.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
