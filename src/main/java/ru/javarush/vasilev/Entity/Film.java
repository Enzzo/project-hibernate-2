package ru.javarush.vasilev.Entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "film", schema = "movie")
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String descriptor;

    @Basic
    @Column(name = "release_year", nullable = false)
    private Date releaseYear;

    @ManyToOne
    @JoinColumn(name = "language_id")
    private Language languageId;

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