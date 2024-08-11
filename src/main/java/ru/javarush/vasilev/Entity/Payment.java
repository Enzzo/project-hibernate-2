package ru.javarush.vasilev.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "payment", schema = "movie")
public class Payment {
}
