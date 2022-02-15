/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;



/**
 *
 * @author Anjali
 */
public class Car {
    
    
    private String brand;
    private String model;
    private String Color;
    private String SerialNum;
    private boolean available;
    private String yearOfMunufacture;
    private int SeatNum;
    private String city;

    public Car() {
        this.brand = brand;
        this.model = model;
        this.Color = Color;
        this.SerialNum = SerialNum;
        this.available = available;
        this.yearOfMunufacture = yearOfMunufacture;
        this.SeatNum = SeatNum;
        this.city = city;
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
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getSerialNum() {
        return SerialNum;
    }

    public void setSerialNum(String SerialNum) {
        this.SerialNum = SerialNum;
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
        return SeatNum;
    }

    public void setSeatNum(int SeatNum) {
        this.SeatNum = SeatNum;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
    
}
