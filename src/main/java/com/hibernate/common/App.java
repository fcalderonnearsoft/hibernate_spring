package com.hibernate.common;

import com.hibernate.persistence.HibernateUtil;
import org.hibernate.Session;

public class App {

    public static void main( String[] args )
    {
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        Course course = new Course();

        course.setDescription("prueba");
        course.setTitle("hola");
        course.setId(778);
        course.setTeacherId(1);
        course.setDurationInMinutes(10);

        session.save(course);
        session.getTransaction().commit();


//        session.beginTransaction();
//        Stock stock1 = new Stock();
//        stock1.setStockCode("9");
//        stock1.setStockName("Po");
//        session.save(stock1);
//        session.getTransaction().commit();

        session.close();
    }
}
