package ru.chepikov.springmvcobjectmapper.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;

    private String name;

    private String description;

    private double price;

    private int quantityInStock;

}
