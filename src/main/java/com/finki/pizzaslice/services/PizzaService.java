package com.finki.pizzaslice.services;

import com.finki.pizzaslice.models.Ingredient;
import com.finki.pizzaslice.models.Pizza;
import com.finki.pizzaslice.models.User;
import com.finki.pizzaslice.repos.PizzaRepository;
import com.finki.pizzaslice.repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class PizzaService {

    private final PizzaRepository pizzaRepository;

    @Autowired
    public PizzaService(PizzaRepository pizzaRepository) {
        this.pizzaRepository = pizzaRepository;
    }

    public List<Pizza> findAllPizzas(){
        return pizzaRepository.findAll();
    }

    public Optional<Pizza> findById(Long id){
        return pizzaRepository.findById(id);
    }

    public Pizza addPizza(Pizza pizza){
        return pizzaRepository.save(pizza);
    }

    public Set<Ingredient> getIngredients(Long id){
        Pizza pizza = pizzaRepository.findById(id).orElseThrow();
        return pizza.getIngredients();
    }
}
