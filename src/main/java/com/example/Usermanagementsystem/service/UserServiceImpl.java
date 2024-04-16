package com.example.Usermanagementsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Usermanagementsystem.model.User;
import com.example.Usermanagementsystem.repository.UserRepository;

@Service

public class UserServiceImpl implements UserService{


    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
      return userRepository.save(user);
    }

    @Override
    public boolean checkEmail(String email) {
      return userRepository.existSByEmail(email);
    }
    
}
