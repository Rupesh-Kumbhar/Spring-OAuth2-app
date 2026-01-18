package com.example.Spring_OAuth2_app.controller;

import com.example.Spring_OAuth2_app.model.Users;
import com.example.Spring_OAuth2_app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public Users register(@RequestBody Users user){
        return userService.registerUser(user);
    }

}
