/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


import java.util.Random;
import com.github.javafaker.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Anjali
 */
public class DataLoader {
    
    
    private System system;

    public DataLoader(System system) {
        this.system = system;
    }
    
    
    public void populatePerson(){
        Faker faker = new Faker();
        Random random = new Random();
        
        for (int i =0; i <20; i++){
            Person person = this.system.getPersonDirectory().addNewPerson();
            person.setName(faker.name().name());
            person.setAge(faker.number().numberBetween(1, 70));
            person.setPhoneNo(String.valueOf(faker.phoneNumber()));
            person.setAddress(faker.address().streetAddress());
            
        }
    }
    
    public void populatePatient( ){
        
        Faker faker = new Faker();
        Random random = new Random();
        
        for (int i =0; i <20; i++){
            Patient patient = this.system.getPatientDirectory().addNewPatient();
            
             
        }   
    }
    
    
    
    
    
    
    
}
