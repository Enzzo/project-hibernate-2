package ru.javarush.vasilev.dao;

import org.hibernate.SessionFactory;
import ru.javarush.vasilev.domain.Address;

public class AddressDAO extends GenericDAO<Address> {
    public AddressDAO(SessionFactory sessionFactory) {
        super(Address.class, sessionFactory);
    }
}