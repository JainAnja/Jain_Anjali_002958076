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
public class CarCatalog {

    private ArrayList<Car> cars;

    public CarCatalog() {
        this.cars = new ArrayList();

    }

    public ArrayList<Car> getCars() {
        return this.cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }

    public Car findFirstAvailableCar() {
        for (Car car : this.cars) {
            if (car.isAvailable()) {
                return car;
            }
        }
        return null;
    }

    public int findCurrentlyAvailableCars() {
        int count = 0;
        for (Car car : this.cars) {
            if (car.isAvailable()) {
                count += 1;
            }

        }
        return (count);

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
            if (car.getYearOfMunufacture().equalsIgnoreCase(input)) {
                result.add(car);

            }
        }
        return result;

    }
    
    public ArrayList<Car> findCarBySeat(int min, int max ) {

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
            if(car.getSerialNum().equalsIgnoreCase(input)){
                return car;
            }
        }
        return null;
    }
    
    
    
    public Car addNewCar(){
        Car car = new Car();
        cars.add(car);
        return car;
        }
    
    
    
}
