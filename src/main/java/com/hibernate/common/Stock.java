package com.hibernate.common;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by fcalderon on 8/12/16.
 */
/*@Entity
@Table(name = "stock")*/
public class Stock implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer stockId;
    private String stockCode;
    private String stockName;

    public Stock() {
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
}
