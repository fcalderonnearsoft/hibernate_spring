package com.hibernate.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/*@Entity
@Table(name = "stock")*/
public class Stock implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer stockId;
    private String stockCode;
    private String stockName;
    private List<StockHistory> stockHistoryList = new ArrayList<StockHistory>();
    private ProteinData proteinData;

    public Stock() {
        setProteinData(new ProteinData());
    }

    public Stock(Integer id, String stockCode, String stockName) {
        this.stockId = id;
        this.stockCode = stockCode;
        this.stockName = stockName;
    }

  /*  @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "STOCK_ID")*/
    public Integer getStockId() {
        return this.stockId;
    }

    public void setStockId(Integer stockId) {
        this.stockId = stockId;
    }

/*    @Column(name = "STOCK_CODE")*/
    public String getStockCode() {
        return this.stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

   /* @Column(name = "STOCK_NAME")*/
    public String getStockName() {
        return this.stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public List<StockHistory> getStockHistoryList() {
        return stockHistoryList;
    }

    public void setStockHistoryList(List<StockHistory> stockHistoryList) {
        this.stockHistoryList = stockHistoryList;
    }

    public ProteinData getProteinData() {
        return proteinData;
    }

    public void setProteinData(ProteinData proteinData) {
        this.proteinData = proteinData;
        proteinData.setStock(this);
    }

    public void addStockHistoryList(StockHistory stockHistoryList) {
        stockHistoryList.setStock(this);
        this.stockHistoryList.add(stockHistoryList);
    }
}
