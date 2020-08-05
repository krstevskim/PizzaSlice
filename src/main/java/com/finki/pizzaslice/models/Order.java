package com.finki.pizzaslice.models;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "orders",schema = "db")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "date_order")
    private Date dateOrder;

    @Column(name = "date_finish")
    private Date dateFinish;

    @Column
    private Double price;

    @Column
    private Integer time;

    @Column
    private Long user_id;


//    @OneToOne
//    @JoinColumn(name = "fk_user",referencedColumnName = "id")
//    private User user;

    @ManyToOne
    @JoinColumn(name = "fk_user",nullable = false,insertable = false,updatable = false)
    private User user;

    @OneToMany(mappedBy = "order")
    private Set<Pizza> pizzas;

    @OneToMany(mappedBy = "order")
    private Set<Extra> extras;

    public Long getId() {
        return id;
    }

    public Date getDateOrder() {
        return dateOrder;
    }

    public Date getDateFinish() {
        return dateFinish;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getTime() {
        return time;
    }

    public Set<Pizza> getPizzas() {
        return pizzas;
    }

    public Set<Extra> getExtras() {
        return extras;
    }


//    public User getUser() {
//        return user;
//    }
}
