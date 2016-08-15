package com.hibernate.common;

import com.hibernate.persistence.HibernateUtil;
import org.hibernate.Session;

import java.util.Date;

/**
 * Created by fcalderon on 8/12/16.
 */
public class App {

    public static void main( String[] args )
    {
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();

        Stock stock = new Stock();
        stock.getProteinData().setGoal(250);
        stock.setStockCode("JUU");
        stock.addStockHistoryList(new StockHistory(new Date(), "Set stock code to JUU"));
        stock.setStockName("OI");
        stock.addStockHistoryList(new StockHistory(new Date(), "Set stock name to OI"));

        session.save(stock);
        session.refresh(stock);
        session.getTransaction().commit();
        session.close();
        HibernateUtil.getSessionFactory().close();
    }
}
