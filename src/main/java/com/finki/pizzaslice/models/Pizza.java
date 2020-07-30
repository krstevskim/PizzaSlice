package com.finki.pizzaslice.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="pizzas", schema = "db")
public class Pizza {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private Double price;

    @OneToMany(mappedBy = "pizza")
    private Set<Ingredient> ingredients;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Set<Ingredient> getIngredients() {
        return ingredients;
    }

}
