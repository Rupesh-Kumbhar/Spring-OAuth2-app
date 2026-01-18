package com.example.Spring_OAuth2_app.service;

import com.example.Spring_OAuth2_app.model.Users;
import com.example.Spring_OAuth2_app.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo repo;

    public BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public Users registerUser(Users user){
        user.setPassword(encoder.encode(user.getPassword()));
        return repo.save(user);
    }

}
