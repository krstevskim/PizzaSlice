package com.finki.pizzaslice.models;

import javax.persistence.*;
import java.util.Date;

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
    private String promo;

    @OneToOne
    @JoinColumn(name = "fk_user",referencedColumnName = "id")
    private User user;

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

    public String getPromo() {
        return promo;
    }

    public User getUser() {
        return user;
    }
}
