package com.finki.pizzaslice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {


    @GetMapping
    public String home(){
        StringBuilder sb = new StringBuilder();
        sb.append("PizzaController -> /api/pizza/all \n");
        sb.append("OrdersController -> /api/orders/all \n");
        sb.append("UsersController -> /api/users/all \n");
        sb.append("ExtrasController -> /api/extras/all \n");
        return sb.toString();
    }


}
