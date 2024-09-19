package ru.javarush.vasilev;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.javarush.vasilev.Entity.Rating;

/**
 * Hello world!
 *
 */
public class App{
    public static void main( String[] args ){
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        try(Session session = sessionFactory.openSession()){
            System.out.println("hello");
        }
    }
}