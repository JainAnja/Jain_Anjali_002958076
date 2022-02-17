package model;

import java.util.ArrayList;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Anjali
 */


import com.github.javafaker.Faker;
import java.util.Random;
import java.util.concurrent.TimeUnit;
public class DataLoader {
    
    private Business business;
    Faker faker = new Faker();
    private ArrayList<String> brand;
    private ArrayList<String> color;
    private ArrayList<String> city;
    
    public DataLoader(Business business) {
        this.business = business;
        this.brand = new ArrayList<>();
        this.brand.add("Honda");
        this.brand.add("Toyota");
        this.brand.add("Uber Manufacture");
        this.brand.add("Tesla");
        
        this.color = new ArrayList<>();
        this.color.add("Red");
        this.color.add("Blue");
        this.color.add("White");
        this.color.add("Black");
        
        this.city = new ArrayList<>();
        this.city.add("Boston");
        this.city.add("New York");
        this.city.add("Miami");
        this.populateCarCatalog();
        
        
        
        
    }
    
    public void populateCarCatalog() {
        Random random = new Random();
        
        
        for(int i =0; i < 10; i++){
            Car car = this.business.getCarCatalog().addNewCar();
            car.setBrand(this.brand.get(random.nextInt(this.brand.size()-1)));
            car.setColor(this.color.get(random.nextInt(this.color.size()-1)));
            car.setCity( this.city.get(random.nextInt(this.city.size()-1)));
            car.setAvailable(random.nextBoolean());
            car.setPrice(random.nextInt(50000)+1);
            car.setSeatNum(random.nextInt(5)+1);
            
//            car.setPrice(Double.parseDouble(faker.commerce().price()));
//            car.setSeatNum(Integer.parseInt(faker.number().digit()));
//            
    }       
            
    }
    
        
        
     
    public void populateCityCatalog() {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Boston");
        cities.add("New York");
        cities.add("Miami");
        
        // Add multiple cities
        
    }
    
    public void populateManufacturerCatalog() {
        
    }
    
  
    
}
