package io.altar.upacademy.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import io.altar.upacademy.view.ProductBean;
 
@ManagedBean(name = "productService")
@ApplicationScoped

public class ProductService {
	
    private final static Double[] IVA;
     
    private final static String[] name;
     
    static {
        IVA = new Double[3];
        IVA[0] = 6.0;
        IVA[1] = 13.0;
        IVA[2] = 23.0;
     
        name = new String[6];
        name[0] = "PS4";
        name[1] = "Wii U";
        name[2] = "Xbox One";
        name[3] = "PSP";
        name[4] = "Nintendo Switch";
        name[5] = "Nintendo 3DS";
        name[6] = "PS3";
    }
     
    public List<ProductBean> createStocks(int size) {
        List<ProductBean> list = new ArrayList<ProductBean>();
        for(int i = 0 ; i < size ; i++) {
            list.add(new ProductBean(getRandomId(), getRandomName(), getRandomVal(), getRandomIVA(), getRandomPVP()));
        }
         
        return list;
    }
     
    private String getRandomId() {
        return UUID.randomUUID().toString().substring(0, 8);
    }
    
    private String getRandomName() {
        return name[(int) (Math.random() * 6)];
    }
     
    private double getRandomVal() {
        return (int) (Math.random() * 3 + 10);
    }
     
    private Double getRandomIVA() {
        return IVA[(int) (Math.random() * 3)];
    }
     
     
    public double getRandomPVP() {
        return (int) (Math.random() * 50 + 250);
    }
     
    
    public List<Double> getIVA() {
        return Arrays.asList(IVA);
    }
     
    public List<String> getName() {
        return Arrays.asList(name);
    }
}