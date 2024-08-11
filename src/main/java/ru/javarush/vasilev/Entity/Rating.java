package ru.javarush.vasilev.Entity;

public enum Rating {
    g ("g"),
    pg("pg"),
    pg13("pg-13"),
    r("r"),
    nc17("nc-17");

    private String rating;

    Rating(String rating) {
        this.rating = rating;
    }
}