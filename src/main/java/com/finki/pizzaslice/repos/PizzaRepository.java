package com.finki.pizzaslice.repos;

import com.finki.pizzaslice.models.Ingredient;
import com.finki.pizzaslice.models.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PizzaRepository extends JpaRepository<Pizza,Long> {


}
