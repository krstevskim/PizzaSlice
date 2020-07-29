package com.finki.pizzaslice.repos;

import com.finki.pizzaslice.models.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PizzaRepository extends JpaRepository<Pizza,Long> {
}
