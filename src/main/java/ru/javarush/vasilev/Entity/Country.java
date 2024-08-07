package ru.javarush.vasilev.Entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "country", schema = "movie")
public class Country {
    @Id
    @Column(name = "counry_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer country_id;

    @Column(name = "country", length = 50, nullable = false)
    private String country;

    @Column(name = "last_update", nullable = false)
    private Timestamp last_update;

    public Integer getCountry_id() {
        return country_id;
    }

    public void setCountry_id(Integer country_id) {
        this.country_id = country_id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Timestamp getLast_update() {
        return last_update;
    }

    public void setLast_update(Timestamp last_update) {
        this.last_update = last_update;
    }
}
