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

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
