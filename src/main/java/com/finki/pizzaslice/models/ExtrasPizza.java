package com.finki.pizzaslice.models;

import javax.persistence.*;

@Entity
@Table(name = "extras_pizza",schema = "db")
public class ExtrasPizza {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



}
