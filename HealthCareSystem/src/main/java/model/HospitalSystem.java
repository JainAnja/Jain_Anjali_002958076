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
public class HospitalSystem {
    
    PersonDirectory personDirectory;
    PatientDirectory patientDirectory;
    ArrayList<City> cities;
   

    public HospitalSystem() {
        this.personDirectory = new PersonDirectory();
        this.patientDirectory = new PatientDirectory();
        this.cities = new ArrayList();
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(PersonDirectory personDirectory) {
        this.personDirectory = personDirectory;
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

    public ArrayList<City> getCities() {
        return cities;
    }

    public void setCities(ArrayList<City> cities) {
        this.cities = cities;
    }
    
     public City addNewCity(String name){
        City city = new City(name);
         cities.add(city);
        return city;
    }
     
    public City getCityByName(String name) {
        for (City city : this.cities) {
            if (city.getName().equalsIgnoreCase(name)) {
                return city;
            }
        }
        
        return null;
    } 
    
    
     
    
}
