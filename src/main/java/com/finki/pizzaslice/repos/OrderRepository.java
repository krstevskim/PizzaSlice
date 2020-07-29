package com.finki.pizzaslice.repos;

import com.finki.pizzaslice.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {

    @Async
    @Query("SELECT o FROM Order o where o.user = :user_id")
    public List<Order> getOrdersByUserId(@Param("user_id")Long user_id);

}
