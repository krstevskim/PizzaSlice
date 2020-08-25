package com.finki.pizzaslice.models;

import javax.persistence.*;
import java.util.Set;

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

    @Column(nullable = true,columnDefinition = "BOOLEAN DEFAULT FALSE")
    private Boolean role;

    @Column
    private String mobile;

//    @OneToOne(mappedBy = "user")
//    private Order order;

    @OneToMany(mappedBy = "user")
    private Set<Order> orders;

    public Boolean getRole(){
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

    public Set<Order> getOrders() {
        return orders;
    }
}
