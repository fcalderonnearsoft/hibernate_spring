package com.hibernate.common;

import com.hibernate.persistence.HibernateUtil;
import org.hibernate.Session;

/**
 * Created by fcalderon on 8/12/16.
 */
public class App {

    public static void main( String[] args )
    {
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        Stock stock = new Stock();

        stock.setStockCode("9");
        stock.setStockName("Po");

        session.save(stock);
        session.getTransaction().commit();


        session.beginTransaction();
        Stock stock1 = new Stock();
        stock1.setStockCode("9");
        stock1.setStockName("Po");
        session.save(stock1);
        session.getTransaction().commit();

        session.close();
    }
}
