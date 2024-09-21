package ru.javarush.vasilev.dao;

import org.hibernate.SessionFactory;
import ru.javarush.vasilev.domain.Actor;

public class ActorDAO extends GenericDAO<Actor> {
    public ActorDAO(SessionFactory sessionFactory) {
        super(Actor.class, sessionFactory);
    }
}