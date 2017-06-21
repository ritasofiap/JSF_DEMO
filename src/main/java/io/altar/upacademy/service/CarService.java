package io.altar.upacademy.service;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import io.altar.upacademy.Car;
 
@ManagedBean(name = "carService")
@ApplicationScoped
public class CarService {
     
    private final static String[] colors;
     
    private final static String[] brands;
     
    static {
        colors = new String[3];
        colors[0] = "6";
        colors[1] = "13";
        colors[2] = "23";
     
        brands = new String[10];
        brands[0] = "PS4";
        brands[1] = "Wii U";
        brands[2] = "Xbox One";
        brands[3] = "PSP";
        brands[4] = "Nintendo Switch";
        brands[5] = "Nintendo 3DS";
        brands[6] = "PS3";
        brands[7] = "Wii";
        brands[8] = "PC";
        brands[9] = "Mac";
    }
     
    public List<Car> createCars(int size) {
        List<Car> list = new ArrayList<Car>();
        for(int i = 0 ; i < size ; i++) {
            list.add(new Car(getRandomId(), getRandomBrand(), getRandomYear(), getRandomColor(), getRandomPrice(), getRandomSoldState()));
        }
         
        return list;
    }
     
    private String getRandomId() {
        return UUID.randomUUID().toString().substring(0, 8);
    }
     
    private int getRandomYear() {
        return (int) (Math.random() * 3 + 10);
    }
     
    private String getRandomColor() {
        return colors[(int) (Math.random() * 3)];
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
 
    public List<String> getColors() {
        return Arrays.asList(colors);
    }
     
    public List<String> getBrands() {
        return Arrays.asList(brands);
    }
}