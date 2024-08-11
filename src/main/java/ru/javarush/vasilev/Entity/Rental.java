package ru.javarush.vasilev.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "rental", schema = "movie")
public class Rental {
}
