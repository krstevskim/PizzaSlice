package com.finki.pizzaslice.models;

import javax.persistence.*;

@Entity
@Table(name = "order_pizza_extras",schema = "db")
public class OrderPizzaExtra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Long fk_pizza;

    @Column
    private Long fk_order;

    @Column
    private Long fk_extras;

    public Long getId() {
        return id;
    }

    public Long getFk_pizza() {
        return fk_pizza;
    }

    public Long getFk_order() {
        return fk_order;
    }

    public Long getFk_extras() {
        return fk_extras;
    }

}
