package com.example.springboot.register.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot.register.model.User;

public interface UserRepo extends JpaRepository<User,Integer>{
    
}