package com.finki.pizzaslice.services;


import com.finki.pizzaslice.models.OrderPizzaExtra;
import com.finki.pizzaslice.repos.OrderPizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderPizzaService {

    private OrderPizzaRepository orderPizzaRepository;

    @Autowired
    public OrderPizzaService(OrderPizzaRepository orderPizzaRepository) {
        this.orderPizzaRepository = orderPizzaRepository;
    }

    public List<OrderPizzaExtra> getAll(){
        return orderPizzaRepository.findAll();
    }

    public Optional<OrderPizzaExtra> findOneById(Long id){
        return orderPizzaRepository.findById(id);
    }

}
