/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;



/**
 *
 * @author Anjali
 */
public class Car {
    
    
    private String brand;
    private String model;
    private String color;
    private String serialNum;
    private boolean available;
    private String yearOfMunufacture;
    private int seatNum;
    private String city;
    private double price;
    
    
    

    public Car() {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.serialNum = serialNum;
        this.available = available;
        this.yearOfMunufacture = yearOfMunufacture;
        this.seatNum = seatNum;
        this.city = city;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(String serialNum) {
        this.serialNum = serialNum;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getYearOfMunufacture() {
        return yearOfMunufacture;
    }

    public void setYearOfMunufacture(String yearOfMunufacture) {
        this.yearOfMunufacture = yearOfMunufacture;
    }

    public int getSeatNum() {
        return seatNum;
    }

    public void setSeatNum(int seatNum) {
        this.seatNum = seatNum;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
    
    
}
