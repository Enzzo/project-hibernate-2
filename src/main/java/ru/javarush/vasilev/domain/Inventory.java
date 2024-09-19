package ru.javarush.vasilev.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "inventory", schema = "movie")
public class Inventory {
}
