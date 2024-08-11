package ru.javarush.vasilev.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "customer", schema = "movie")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
}