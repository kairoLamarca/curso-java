package com.lamarcakairo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lamarcakairo.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
