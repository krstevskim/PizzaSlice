package com.finki.pizzaslice.controllers;


import com.finki.pizzaslice.models.Order;

import com.finki.pizzaslice.services.OrderService;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public ResponseEntity<Order> getOrderById(@PathVariable("id") Long id){
        return ResponseEntity.ok(orderService.getOrderById(id));
    }

    @PostMapping("/add")
    public Order addOrder(@NotNull @RequestBody Order order){
        return orderService.addOrder(order);
    }

//    @GetMapping("/user/{id}")
//    public List<Order> getOrdersForUser(@PathVariable("id") Long id){
//        return orderService.getOrdersByUserId(id);
//    }
}
