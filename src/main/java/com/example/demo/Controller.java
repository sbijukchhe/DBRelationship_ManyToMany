package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    private StudentRepository repository;

    @Autowired
    private CourseRepository crepository;

    @RequestMapping("/")
    public String home(){
        return "index";
    }

}