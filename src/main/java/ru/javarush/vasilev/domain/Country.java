package ru.javarush.vasilev.domain;

import jakarta.persistence.*;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@Table(name = "country", schema = "movie")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "country_id", nullable = false)
    private Short id;

    @Column(name = "country", length = 50, nullable = false)
    private String title;

    @Column(name = "last_update", nullable = false)
    @UpdateTimestamp
    private LocalDateTime last_update;

    public Short getCountry_id() {
        return id;
    }

    public void setCountry_id(Short id) {
        this.id = id;
    }

    public String getCountry() {
        return title;
    }

    public void setCountry(String country) {
        this.title = country;
    }

    public LocalDateTime getLast_update() {
        return last_update;
    }

    public void setLast_update(LocalDateTime last_update) {
        this.last_update = last_update;
    }
}
