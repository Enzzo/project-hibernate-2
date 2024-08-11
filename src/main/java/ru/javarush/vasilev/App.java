package ru.javarush.vasilev;

import ru.javarush.vasilev.Entity.Rating;

/**
 * Hello world!
 *
 */
public class App{
    public static void main( String[] args ){
        Rating r = Rating.nc17;
        System.out.println(r.ordinal());
    }
}