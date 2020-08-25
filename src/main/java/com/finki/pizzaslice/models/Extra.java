package com.finki.pizzaslice.models;

import javax.persistence.*;

@Entity
@Table(name = "extras",schema = "db")
public class Extra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private double price;

//    @Column
//    private Long order_id;
//
//    @ManyToOne
//    @JoinColumn(name = "order_id",nullable = false,insertable = false,updatable = false)
//    private Order order;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
