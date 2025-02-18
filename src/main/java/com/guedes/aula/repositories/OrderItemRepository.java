package com.guedes.aula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guedes.aula.entities.OrderItem;
import com.guedes.aula.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
	
}
