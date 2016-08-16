package com.hibernate.common;

import com.hibernate.persistence.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testCreateSampleData() {
        App app = new App();

        app.createSampleData();

        Session session = HibernateUtil.getSessionFactory().openSession();
        //session.beginTransaction();
        List<Stock> stockList = session.createQuery("from Stock").list();

        for(Stock stock : stockList){
            System.out.println(stock.getStockName());
        }



        session.getTransaction().rollback();
        session.close();
    }
}