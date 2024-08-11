package ru.javarush.vasilev.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "film_actor", schema = "movie")
public class FilmActor {
}
