package ru.javarush.vasilev.dao;

import org.hibernate.SessionFactory;
import ru.javarush.vasilev.domain.Country;

public class CountryDAO extends GenericDAO<Country> {
    public CountryDAO(SessionFactory sessionFactory) {
        super(Country.class, sessionFactory);
    }
}