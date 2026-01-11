package com.example.Spring_OAuth2_app.controller;

import com.example.Spring_OAuth2_app.model.studentModel;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class studentController {

    private List<studentModel> studentList = new ArrayList<>(List.of(
            new studentModel("rk",22,"rk@gmail.com"),
            new studentModel("pk",11, "pk@gmail.com")
    ));

    @GetMapping("/students")
    public List<studentModel> getStudent(){
        return studentList;
    }

    @PostMapping("/add")
    public studentModel addStudent(@RequestBody studentModel std){
        studentList.add(std);
        return std;
    }

    @GetMapping("/get-csrf-token")
    public CsrfToken getCsrf(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");
    }

}