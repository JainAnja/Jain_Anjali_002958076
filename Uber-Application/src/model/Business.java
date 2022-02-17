/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Anjali
 */
public class Business {
    
    CarCatalog carCatalog;
    ManufactureDirectory manufactureDirectory;

    public Business() {
        this.carCatalog = new CarCatalog();
        this.manufactureDirectory = new ManufactureDirectory();
    }

    public CarCatalog getCarCatalog() {
        return carCatalog;
    }

    public void setCarCatalog(CarCatalog carCatalog) {
        this.carCatalog = carCatalog;
    }

    public ManufactureDirectory getManufactureDirectory() {
        return manufactureDirectory;
    }

    public void setManufactureDirectory(ManufactureDirectory manufactureDirectory) {
        this.manufactureDirectory = manufactureDirectory;
    }

  
    
}
