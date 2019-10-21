package com.lamarcakairo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lamarcakairo.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
