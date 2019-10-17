package com.lamarcakairo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lamarcakairo.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
