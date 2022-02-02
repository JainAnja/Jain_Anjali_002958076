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
public class CarProfile {
    
    
    private String brand;
    private String model;
    private String color;
    private String year;
    private String engineNo;
    private String seatsNumber;
    private ArrayList<String> licensePlates;
    private String ownerName;
    private ArrayList<String> ownerTelephonenumbers;
    private ArrayList<String> ownerEmailAddresses;
    private String ownerDriverLicense;
    private String ownerSocialSecurityNumber;
    private String ownerAddress;
    private ServiceRecordHistory serviceRecords;
    private String warrantyYear;
    private String photo;

    public CarProfile() {
        
        this.licensePlates = new ArrayList<>();
        this.ownerTelephonenumbers = new ArrayList<>();
        this.ownerEmailAddresses = new ArrayList<>();
        this.serviceRecords = new ServiceRecordHistory();
       
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

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getEngineNo() {
        return engineNo;
    }

    public void setEngineNo(String engineNo) {
        this.engineNo = engineNo;
    }

    public String getSeatsNumber() {
        return seatsNumber;
    }

    public void setSeatsNumber(String seatsNumber) {
        this.seatsNumber = seatsNumber;
    }

    public ArrayList<String> getLicensePlates() {
        return licensePlates;
    }

    public void setLicensePlates(ArrayList<String> licensePlates) {
        this.licensePlates = licensePlates;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public ArrayList<String> getOwnerTelephonenumbers() {
        return ownerTelephonenumbers;
    }

    public void setOwnerTelephonenumbers(ArrayList<String> ownerTelephonenumbers) {
        this.ownerTelephonenumbers = ownerTelephonenumbers;
    }

    public ArrayList<String> getOwnerEmailAddresses() {
        return ownerEmailAddresses;
    }

    public void setOwnerEmailAddresses(ArrayList<String> ownerEmailAddresses) {
        this.ownerEmailAddresses = ownerEmailAddresses;
    }

    public String getOwnerDriverLicense() {
        return ownerDriverLicense;
    }

    public void setOwnerDriverLicense(String ownerDriverLicense) {
        this.ownerDriverLicense = ownerDriverLicense;
    }

    public String getOwnerSocialSecurityNumber() {
        return ownerSocialSecurityNumber;
    }

    public void setOwnerSocialSecurityNumber(String ownerSocialSecurityNumber) {
        this.ownerSocialSecurityNumber = ownerSocialSecurityNumber;
    }

    public String getOwnerAddress() {
        return ownerAddress;
    }

    public void setOwnerAddress(String ownerAddress) {
        this.ownerAddress = ownerAddress;
    }

    public ServiceRecordHistory getServiceRecords() {
        return serviceRecords;
    }

    public void setServiceRecords(ServiceRecordHistory serviceRecords) {
        this.serviceRecords = serviceRecords;
    }

    public String getWarrantyYear() {
        return warrantyYear;
    }

    public void setWarrantyYear(String warrantyYear) {
        this.warrantyYear = warrantyYear;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
    
    
 
    
}
