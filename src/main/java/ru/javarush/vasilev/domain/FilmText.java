package ru.javarush.vasilev.domain;

import jakarta.persistence.*;
import org.hibernate.annotations.Type;

@Entity
@Table(name = "film_text", schema = "movie")
public class FilmText {
    // Этот ID нужен для Entity. Поэтому тут два film_id
    @Id
    @Column(name = "film_id")
    private Short id;

    @OneToOne
    @JoinColumn(name = "film_id")
    private Film film;

    private String title;

    @Column(columnDefinition = "text")
    @Type(type = "text")
    private String description;

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}