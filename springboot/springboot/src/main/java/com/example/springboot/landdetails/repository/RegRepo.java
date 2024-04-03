package com.example.springboot.landdetails.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.springboot.landdetails.model.Reg;
public interface RegRepo extends JpaRepository<Reg,Integer>{
    
}