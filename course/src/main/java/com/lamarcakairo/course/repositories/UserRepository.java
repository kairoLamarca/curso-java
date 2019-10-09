package com.lamarcakairo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lamarcakairo.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
