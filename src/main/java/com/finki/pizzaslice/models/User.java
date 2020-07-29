package com.finki.pizzaslice.models;

import javax.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer user_id;

    @Column
    private boolean isAdmin;

    @Column
    private String address;

    @Column
    private String name;

    @Column
    private String surname;

    @Column
    private String phoneNumber;
}
