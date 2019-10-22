package com.lamarcakairo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lamarcakairo.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
