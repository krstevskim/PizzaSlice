package com.finki.pizzaslice.controllers;

import com.finki.pizzaslice.models.OrderPizzaExtra;
import com.finki.pizzaslice.services.OrderPizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/orderpizza")
public class OrderPizzaController {

    private OrderPizzaService orderPizzaService;

    @Autowired
    public OrderPizzaController(OrderPizzaService orderPizzaService) {
        this.orderPizzaService = orderPizzaService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<OrderPizzaExtra>> getAll(){
        return ResponseEntity.ok(orderPizzaService.getAll());
    }
}
