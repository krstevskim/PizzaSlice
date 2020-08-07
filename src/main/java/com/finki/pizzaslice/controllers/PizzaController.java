package com.finki.pizzaslice.controllers;


import com.finki.pizzaslice.models.Ingredient;
import com.finki.pizzaslice.models.Pizza;
import com.finki.pizzaslice.models.User;
import com.finki.pizzaslice.services.PizzaService;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@RestController
@RequestMapping("/api/pizza")
public class PizzaController {

    private final PizzaService pizzaService;

    @Autowired
    public PizzaController(PizzaService pizzaService) {
        this.pizzaService = pizzaService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Pizza>> getAll(){
        return ResponseEntity.ok(pizzaService.findAllPizzas());
    }

    @GetMapping("{id}")
    public Optional<Pizza> getPizza(@PathVariable("id") Long id){
        return pizzaService.findById(id);
    }

    @PostMapping("/add")
    public Pizza addPizza(@NotNull @RequestBody Pizza pizza){
        return pizzaService.addPizza(pizza);
    }

    @GetMapping("{id}/ingredients")
    public ResponseEntity<Set<Ingredient>> getIngredients(@PathVariable("id") Long id){
        return ResponseEntity.ok(pizzaService.getIngredients(id));
    }

}
