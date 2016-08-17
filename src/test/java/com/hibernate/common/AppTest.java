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

        int goal = 3000, total = 250;
        String stockCode = "ERCFEW", stockName = "First of wednesday";

        app.createSampleData(goal, total, stockCode, stockName);

        Session session = HibernateUtil.getSessionFactory().openSession();


        List<Stock> stockList = session.createQuery("from Stock").list();

        Stock stock = stockList.get(0);
        assertEquals(stock.getStockCode(), stockCode);
        assertEquals(stock.getStockName(), stockName);

//        session.beginTransaction();
//        Query deleteQuery = session.createQuery("delete from ProteinData where id = :id");
//        deleteQuery.setParameter("id", stock.getStockId());
//        deleteQuery.executeUpdate();
//
//        deleteQuery = session.createQuery("delete from StockHistory where id = :id");
//        deleteQuery.setParameter("id", stock.getStockId());
//        deleteQuery.executeUpdate();

//        Query deleteQuery = session.createQuery("delete from Stock where stockId = :id");
//        deleteQuery.setParameter("id", stock.getStockId());
//        deleteQuery.executeUpdate();


//        session.getTransaction().commit();
        session.close();
    }
}