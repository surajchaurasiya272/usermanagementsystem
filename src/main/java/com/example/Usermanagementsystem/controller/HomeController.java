package com.example.Usermanagementsystem.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.Usermanagementsystem.model.User;
import com.example.Usermanagementsystem.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class HomeController {


    @Autowired
    private UserService userService;
    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/register")
    public String register() {
        return "register";
    }


    @PostMapping("/createUser")
    public String createUser(@ModelAttribute User user) {

        boolean f=userService.checkEmail(user.getEmail());
        if(f){
            System.out.println("email is already exist");
        }
        else{
            System.out.println("exist");

        }
        // System.out.println("suraj chaurasiya "+user);
        User users=userService.createUser(user);
        if(users !=null){
            System.out.println("Register user successfully");
        }
        else{
            System.out.println("something went wrong");
        }
        return "redirect:/register";
    }
}
