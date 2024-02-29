package ru.chepikov.springmvcobjectmapper.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;

    private String firstName;

    private String lastName;

    private String email;

    private String contactNumber;

}
