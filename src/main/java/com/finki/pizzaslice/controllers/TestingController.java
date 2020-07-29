package com.finki.pizzaslice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestingController {


    @GetMapping
    public String home(){
        return "Home Controller";
    }


}
