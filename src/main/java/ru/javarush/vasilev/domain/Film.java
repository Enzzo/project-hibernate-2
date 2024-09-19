package ru.javarush.vasilev.domain;

import jakarta.persistence.*;
import org.hibernate.annotations.Type;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.Year;
import java.util.Date;

@Entity
@Table(name = "film", schema = "movie")
public class Film {
    @Id
    @Column(name = "film_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    @Column(columnDefinition = "text")
    @Type(type = "text")
    private String descriptor;

    @Column(name = "release_year", nullable = false)
    private Year year;

    @ManyToOne
    @JoinColumn(name = "language_id")
    private Language language;

    @ManyToOne
    @JoinTable(name = "original_language_id")
    private Language originalLanguageId;

    private Integer rentalDuration;
    private BigDecimal rentalRate;
    private Integer length;
    private BigDecimal replacementCost;

//    @Enumerated(EnumType.STRING)
    @Column(name = "rating")
    private String rating;

//    @ElementCollection
//    @CollectionTable(name = "")
//    private Set<String> specialFeatures;
    private String specialFeatures;
    private Timestamp lastUpdate;
}