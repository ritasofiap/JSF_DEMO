package io.altar.upacademy;


import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import io.altar.upacademy.Stock;
import io.altar.upacademy.service.StockService;
 
@ManagedBean(name="dtBasicView")
@ViewScoped
public class BasicView implements Serializable {
     
    private List<Stock> stocks;
     
    @ManagedProperty("#{stockService}")
    private StockService service;
 
    @PostConstruct
    public void init() {
        stocks = service.createStocks(5);
    }
     
    public List<Stock> getStocks() {
        return stocks;
    }
 
    public void setService(StockService service) {
        this.service = service;
    }
}