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
public class Community {
    
    String name;
    ArrayList<House> houses;
    City city;

    public Community(String name) {
        this.houses = new ArrayList<>();
        this.name = name;
    }

    public ArrayList<House> getHouses() {
        return houses;
    }

    public void setHouses(ArrayList<House> houses) {
        this.houses = houses;
    }
    
    public House addNewHouse(String address, Person person){
        House house = new House(address, person);
        houses.add(house);
        return house;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "" + name ;
    }
    
    
    
    
}
