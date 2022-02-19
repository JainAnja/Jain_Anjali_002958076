/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.time.LocalDateTime;




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
    private String yearOfManufacture;
    private int seatNum;
    private String city;
    private double price;
    private LocalDateTime lastUpdated;
    private ArrayList<MaintenanceCertificate> certificates;
    
    

    public Car() {
        this.certificates = new ArrayList<>();
        this.seatNum=5;
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

    public String getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(String yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
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

    public ArrayList<MaintenanceCertificate> getCertificates() {
        return certificates;
    }

    public void setCertificates(ArrayList<MaintenanceCertificate> certificates) {
        this.certificates = certificates;
    }
    
    
    
    public ArrayList<MaintenanceCertificate> findExpiredCerts(){
        ArrayList<MaintenanceCertificate> expiredCerts = new ArrayList();
        for(MaintenanceCertificate maintenanceCertificate : this.certificates){
            if(maintenanceCertificate.getExpieryDate().compareTo(LocalDate.now())>0){
                expiredCerts.add(maintenanceCertificate);
            }
            
            
        } return expiredCerts;
    }
    

    @Override
    public String toString() {
        return brand;
    }
    
    
    
    
}
