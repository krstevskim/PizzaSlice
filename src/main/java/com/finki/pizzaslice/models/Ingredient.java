package com.finki.pizzaslice.models;

import javax.persistence.*;

@Entity
@Table(name = "ingredients",schema = "db")
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private Long pizza_id;

    @ManyToOne
    @JoinColumn(name = "pizza_id",nullable = false,insertable = false,updatable = false)
    private Pizza pizza;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
