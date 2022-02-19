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
public class Business {
    
    CarCatalog carCatalog;
    ArrayList<String> cities;
   
    public Business() {
        this.carCatalog = new CarCatalog();
        this.cities = new ArrayList<>();
        
    }

    public CarCatalog getCarCatalog() {
        return carCatalog;
    }

    public void setCarCatalog(CarCatalog carCatalog) {
        this.carCatalog = carCatalog;
    }

    public ArrayList<String> getCities() {
        return cities;
    }

    public void setCities(ArrayList<String> cities) {
        this.cities = cities;
    }
    
    

   
  
    
}
