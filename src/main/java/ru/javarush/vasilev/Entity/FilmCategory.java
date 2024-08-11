package ru.javarush.vasilev.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "film_category", schema = "movie")
public class FilmCategory {
}
