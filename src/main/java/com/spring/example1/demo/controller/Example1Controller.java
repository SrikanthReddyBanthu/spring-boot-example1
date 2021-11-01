package com.spring.example1.demo.controller;


import com.spring.example1.demo.service.JasyptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Example1Controller {


    @Autowired
    private JasyptService jasyptService;

    @Value("${encrypted.property1}")
    private String property1;

    @RequestMapping("/")
    public String index() {
        jasyptService.test();
        return property1;
    }

}
