package com.finki.pizzaslice.controllers;


import com.finki.pizzaslice.models.Order;

import com.finki.pizzaslice.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/orders")
public class OrdersController {

    private final OrderService orderService;

    @Autowired
    public OrdersController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/all")
    public List<Order> findAll(){
        return orderService.getAllOrders();
    }

    @GetMapping("/{id}")
    public Optional<Order> getOrderById(@PathVariable("id") Long id){
        return orderService.getOrderById(id);
    }
//
//    @GetMapping("/user/{id}")
//    public List<Order> getOrdersForUser(@PathVariable("id") Long id){
//        return orderService.getOrdersByUserId(id);
//    }
}
