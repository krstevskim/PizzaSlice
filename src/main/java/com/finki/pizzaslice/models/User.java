package com.finki.pizzaslice.models;

import javax.persistence.*;

@Entity
@Table(name="users", schema = "db")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String address;

    @Column
    private boolean role;

    @Column
    private String mobile;

    public boolean isAdmin(){
        return role;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getMobile() {
        return mobile;
    }
}
