package com.hibernate.common;

import com.hibernate.persistence.HibernateUtil;
import org.hibernate.Session;

import java.util.Date;

public class App {

    public static void main( String[] args )
    {
       // createSampleData();
    }



    public void createSampleData(){
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();

        Stock stockOne = new Stock();

        stockOne.getProteinData().setGoal(3000);
        stockOne.addStockHistoryList(new StockHistory(new Date(), "Set goal code to 3000"));
        stockOne.getProteinData().setTotal(250);
        stockOne.addStockHistoryList(new StockHistory(new Date(), "Set total code to 250"));
        stockOne.setStockCode("EWRGC");
        stockOne.addStockHistoryList(new StockHistory(new Date(), "Set stock code to EWRGC"));
        stockOne.setStockName("First of stock one");
        stockOne.addStockHistoryList(new StockHistory(new Date(), "Set stock name to First"));

        Stock stockTwo = new Stock();

        stockTwo.getProteinData().setGoal(10000);
        stockTwo.addStockHistoryList(new StockHistory(new Date(), "Set goal code to 10000"));
        stockTwo.getProteinData().setTotal(7500);
        stockTwo.addStockHistoryList(new StockHistory(new Date(), "Set total code to 7500"));
        stockTwo.setStockCode("PRTK");
        stockTwo.addStockHistoryList(new StockHistory(new Date(), "Set stock code to PRTK"));
        stockTwo.setStockName("First of stock two");
        stockTwo.addStockHistoryList(new StockHistory(new Date(), "Set stock name to First"));

        Stock stockThree = new Stock();

        stockThree.getProteinData().setGoal(7600);
        stockThree.addStockHistoryList(new StockHistory(new Date(), "Set goal code to 760"));
        stockThree.getProteinData().setTotal(10);
        stockThree.addStockHistoryList(new StockHistory(new Date(), "Set total code to 10"));
        stockThree.setStockCode("QTRXCD");
        stockThree.addStockHistoryList(new StockHistory(new Date(), "Set stock code to QTRXCD"));
        stockThree.setStockName("First of stock three");
        stockThree.addStockHistoryList(new StockHistory(new Date(), "Set stock name to First"));

        session.save(stockOne);
        session.save(stockTwo);
        session.save(stockThree);
        session.refresh(stockOne);
        session.refresh(stockTwo);
        session.refresh(stockThree);
        session.flush();
    }
}
