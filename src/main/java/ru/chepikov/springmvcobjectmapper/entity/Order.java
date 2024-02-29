package ru.chepikov.springmvcobjectmapper.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "orders")
@Getter
@Setter
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    @ManyToOne
    private Customer customer;

    @ManyToMany
    private List<Product> products;

    private Date orderDate;

    private String shippingAddress;

    private double totalPrice;

    private String orderStatus;

}
