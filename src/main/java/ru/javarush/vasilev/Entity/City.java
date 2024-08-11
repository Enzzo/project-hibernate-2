package ru.javarush.vasilev.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "city", schema = "movie")
public class City {
    private Integer city_id;
    private String city;
    private Country country;
}
