package com.finki.pizzaslice.repos;

import com.finki.pizzaslice.models.OrderPizzaExtra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderPizzaRepository extends JpaRepository<OrderPizzaExtra,Long> {
}
