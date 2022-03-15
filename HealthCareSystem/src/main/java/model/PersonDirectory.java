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
public class PersonDirectory {
    
    ArrayList<Person> persons;

    public PersonDirectory() {
        this.persons = new ArrayList();
        
    }
    
    
    public Person addNewPerson(){
        Person person = new Person();
        persons.add(person);
        return person;
        
    }
    
    
    
    
}
