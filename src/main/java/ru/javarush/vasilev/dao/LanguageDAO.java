package ru.javarush.vasilev.dao;

import org.hibernate.SessionFactory;
import ru.javarush.vasilev.domain.Language;

public class LanguageDAO extends GenericDAO<Language> {
    public LanguageDAO(SessionFactory sessionFactory) {
        super(Language.class, sessionFactory);
    }
}