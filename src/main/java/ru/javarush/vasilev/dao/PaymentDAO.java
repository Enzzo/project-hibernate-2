package ru.javarush.vasilev.dao;

import org.hibernate.SessionFactory;
import ru.javarush.vasilev.domain.Payment;

public class PaymentDAO extends GenericDAO<Payment> {
    public PaymentDAO(SessionFactory sessionFactory) {
        super(Payment.class, sessionFactory);
    }
}