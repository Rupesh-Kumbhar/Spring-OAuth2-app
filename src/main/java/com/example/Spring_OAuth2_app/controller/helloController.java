package com.example.Spring_OAuth2_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {

    @GetMapping("/")
    public String sayHello(){
        return "Hello raa !!";
    }
}
