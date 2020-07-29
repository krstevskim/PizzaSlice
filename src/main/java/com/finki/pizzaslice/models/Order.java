package com.finki.pizzaslice.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    private Integer id;

}
