package io.altar.upacademy.service;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import io.altar.upacademy.Stock;
 
@ManagedBean(name = "stockService")
@ApplicationScoped
public class StockService {
     
    private final static String[] IVA;
     
    private final static String[] brands;
     
    static {
        IVA = new String[3];
        IVA[0] = "6";
        IVA[1] = "13";
        IVA[2] = "23";
     
        brands = new String[10];
        brands[0] = "PS4";
        brands[1] = "Wii U";
        brands[2] = "Xbox One";
        brands[3] = "PSP";
        brands[4] = "Nintendo Switch";
        brands[5] = "Nintendo 3DS";
        brands[6] = "PS3";
        brands[7] = "Wii";
        brands[8] = "GameCube";
        brands[9] = "Gameboy";
    }
     
    public List<Stock> createStocks(int size) {
        List<Stock> list = new ArrayList<Stock>();
        for(int i = 0 ; i < size ; i++) {
            list.add(new Stock(getRandomId(), getRandomBrand(), getRandomYear(), getRandomIVA(), getRandomPrice(), getRandomSoldState()));
        }
         
        return list;
    }
     
    private String getRandomId() {
        return UUID.randomUUID().toString().substring(0, 8);
    }
     
    private int getRandomYear() {
        return (int) (Math.random() * 3 + 10);
    }
     
    private String getRandomIVA() {
        return IVA[(int) (Math.random() * 3)];
    }
     
    private String getRandomBrand() {
        return brands[(int) (Math.random() * 10)];
    }
     
    public int getRandomPrice() {
        return (int) (Math.random() * 50 + 250);
    }
     
    public boolean getRandomSoldState() {
        return (Math.random() > 0.5) ? true: false;
    }
 
    public List<String> getIVA() {
        return Arrays.asList(IVA);
    }
     
    public List<String> getBrands() {
        return Arrays.asList(brands);
    }
}