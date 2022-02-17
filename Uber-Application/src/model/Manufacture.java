/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Anjali
 */
public class Manufacture {
    
    private String ManufactureName;
    private CarCatalog carCatalog;

    public Manufacture() {
        this.carCatalog = new CarCatalog();
    }
    
    
    

    public String getManufactureName() {
        return ManufactureName;
    }

    public void setManufactureName(String ManufactureName) {
        this.ManufactureName = ManufactureName;
    }

    public CarCatalog getCarCatalog() {
        return carCatalog;
    }

    public void setCarCatalog(CarCatalog carCatalog) {
        this.carCatalog = carCatalog;
    }
    

    
    
}
