package com.hibernate.common;

import com.hibernate.persistence.HibernateUtil;
import org.hibernate.Session;

import java.util.Date;

public class App {

    public static void main(String[] args) {
    }


    public void createSampleData(int goal, int total, String stockCode, String stockName) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();

        Stock stockOne = new Stock();

        stockOne.getProteinData().setGoal(goal);
        stockOne.addStockHistoryList(new StockHistory(new Date(), "Set goal code to " + goal));
        stockOne.getProteinData().setTotal(total);
        stockOne.addStockHistoryList(new StockHistory(new Date(), "Set total code to " + total ));
        stockOne.setStockCode(stockCode);
        stockOne.addStockHistoryList(new StockHistory(new Date(), "Set stock code to " + stockCode));
        stockOne.setStockName(stockName);
        stockOne.addStockHistoryList(new StockHistory(new Date(), "Set stock name to " +stockName));

        session.save(stockOne);
//        session.refresh(stockOne);
//        session.refresh(stockTwo);
//        session.refresh(stockThree);
        session.getTransaction().commit();
        session.close();
    }
}
