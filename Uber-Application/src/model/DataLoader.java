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
import java.util.Random;
import com.github.javafaker.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

public class DataLoader {

    private Business business;
   
    public DataLoader(Business business) {
        this.business = business;
        this.populateCarCatalog();        
    }
   
    public void populateCarCatalog() {
        Faker faker = new Faker();
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            Car car = this.business.getCarCatalog().addNewCar();
            car.setBrand(getRandomBrand());
            car.setColor(faker.color().name());
            car.setCity(getRandomCity());
            car.setAvailable(random.nextBoolean());
            car.setPrice(Double.parseDouble(faker.commerce().price(30000, 50000)));
            car.setSeatNum(faker.number().numberBetween(5, 7));
            car.setModel(getRandomModel(car.getBrand()));
            car.setYearOfManufacture(getRandomYear());
            car.setSerialNum(faker.bothify("1?#ED"));
            for (int certIndex = 0; certIndex < random.nextInt(10); certIndex++) {
                MaintenanceCertificate cert = new MaintenanceCertificate(Utils.getRandomDate(), LocalDate.now());
                car.getCertificates().add(cert);
            }
            this.business.getCarCatalog().setLastUpdated(LocalDateTime.now());
             
            
        }
    }

    public String getRandomYear() {
        
        ArrayList<String> years = new ArrayList<>(Arrays.asList("2018", "2019", "2020", "2021", "2017", "2022"));
        return years.get(new Random().nextInt(years.size()));
    }
    
    
    public String getRandomBrand() {

        ArrayList<String> brands = new ArrayList<>(Arrays.asList("Honda", "Toyota", "Hyundai", "Mazda", "Audi", "BMW", "Acura"));
        return brands.get(new Random().nextInt(brands.size()));

    }

    public String getRandomCity() {

        ArrayList<String> cities = new ArrayList<>(Arrays.asList("Boston", "New York", "Los Angelos", "Miami", "Atlanta", "Seattle", "Virginia", "New Jersey", "San Jose"));
        this.business.cities.addAll(cities);
        return cities.get(new Random().nextInt(cities.size()));

    }
    

    public String getRandomModel(String brand) {
        ArrayList<String> models = new ArrayList<>();
        if(brand.equalsIgnoreCase("Honda")) {
            models.addAll(Arrays.asList("CR-V", "Civic", "Accord", "HR-V"));
        }
        else if(brand.equalsIgnoreCase("Toyota")) {
            models.addAll(Arrays.asList("Rav4", "Prius", "Camry", "Venza"));
        }
        else if(brand.equalsIgnoreCase("Hyundai")) {
            models.addAll(Arrays.asList("Sonata", "Santa Fe", "Tucson", "Elantra"));
        }        
        else if(brand.equalsIgnoreCase("Mazda")) {
            models.addAll(Arrays.asList("CX-5", "CX-30", "Mazda6", "CX-9"));
        }
        else if(brand.equalsIgnoreCase("BMW")) {
            models.addAll(Arrays.asList("X1", "X2", "X3", "X5"));
        }
        else if(brand.equalsIgnoreCase("Acura")) {
            models.addAll(Arrays.asList("RDX", "MDX"));
        }
        else {
            models.addAll(Arrays.asList("Q3", "Q5"));
        }
        
        return models.get(new Random().nextInt(models.size()));
    }

}
