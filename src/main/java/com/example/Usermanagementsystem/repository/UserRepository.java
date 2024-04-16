package com.example.Usermanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Usermanagementsystem.model.User;

public interface  UserRepository extends JpaRepository<User,Integer> {
    
    public boolean existSByEmail(String email);
}
