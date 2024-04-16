package com.example.Usermanagementsystem.service;

import com.example.Usermanagementsystem.model.User;

public interface UserService {

    public User createUser(User user);
    
    public boolean checkEmail(String email);
    
}
