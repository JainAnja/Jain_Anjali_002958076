/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.time.LocalDateTime;

/**
 *
 * @author Anjali
 */
public class CarCatalog {

    private ArrayList<Car> cars;
    private LocalDateTime lastUpdated;

    public CarCatalog() {
        this.cars = new ArrayList();

    }

    public ArrayList<Car> getCars() {
        return this.cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public Car findFirstAvailableCar() {
        for (Car car : this.cars) {
            if (car.isAvailable()) {
                return car;
            }
        }
        return null;
    }

    public ArrayList<Car> findCurrentlyAvailableCars() {
        ArrayList<Car> result = new ArrayList<>();
        for (Car car : this.cars) {
            if (car.isAvailable()) {
                result.add(car);
            }

        }
        return result;

    }

    public ArrayList<Car> findCarByBrand(String input) {
        ArrayList<Car> result = new ArrayList<>();
        for (Car car : this.cars) {
            if (car.getBrand().equalsIgnoreCase(input)) {
                result.add(car);

            }
        }
        return result;

    }

    public ArrayList<Car> findCarByYear(String input) {

        ArrayList<Car> result = new ArrayList<>();
        for (Car car : this.cars) {
            if (car.getYearOfManufacture().equalsIgnoreCase(input)) {
                result.add(car);

            }
        }
        return result;

    }

    public ArrayList<Car> findCarBySeat(int min, int max) {

        ArrayList<Car> result = new ArrayList<>();
        for (Car car : this.cars) {
            if (car.getSeatNum() > min && car.getSeatNum() < max) {
                result.add(car);

            }
        }
        return result;

    }

    public Car findCarBySerialNum(String input) {
        for (Car car : this.cars) {
            if (car.getSerialNum().equalsIgnoreCase(input)) {
                return car;
            }
        }
        return null;

    }

    public ArrayList<Car> findCarByModelNumber(String input) {
        ArrayList<Car> result = new ArrayList<>();
        for (Car car : cars) {
            if (car.getModel().equalsIgnoreCase(input)) {
                result.add(car);
            }
        }

        return result;
    }

    public ArrayList<Car> findCarByCity(String input) {
        ArrayList<Car> result = new ArrayList<>();
        for (Car car : cars) {
            if (car.getCity().equalsIgnoreCase(input)) {
                result.add(car);
            }
        }
        return result;
    }

    public ArrayList<Car> findCarsWithExpiredCertificates() {
        ArrayList<Car> result = new ArrayList<>();
        for (Car car : cars) {
            if (car.findExpiredCerts().size() > 1) {
                result.add(car);
            }
        }
        return result;
    }
    
    public ArrayList<String> getCarManufacturersList() {
        ArrayList<String> result = new ArrayList<>();
        for (Car car : this.cars) {
            if(!result.contains(car.getBrand())) {
                result.add(car.getBrand());
            }
        }
        return result;
    }

    public Car addNewCar() {
        Car car = new Car();
        cars.add(car);
        return car;
    }

}
