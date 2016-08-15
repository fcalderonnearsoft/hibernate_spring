package com.hibernate.common;

import java.io.Serializable;
import java.util.Date;

public class StockHistory implements Serializable{

    private Integer id;
    private Stock stock;
    private Date entryTime;
    private String entry;

    public StockHistory() {
    }

    public StockHistory(Date entryTime, String entry) {
        this.entryTime = entryTime;
        this.entry = entry;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public String getEntry() {
        return entry;
    }

    public void setEntry(String entry) {
        this.entry = entry;
    }
}
