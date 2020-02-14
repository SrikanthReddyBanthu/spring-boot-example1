package com.spring.example1.demo.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Example1Controller {

    @Value("${encrypted.property1}")
    private String property1;

    @RequestMapping("/")
    public String index() {
        return property1;
    }

}
