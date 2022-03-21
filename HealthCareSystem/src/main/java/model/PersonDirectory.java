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

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public void setPersons(ArrayList<Person> persons) {
        this.persons = persons;
    }
    
    
    public Person addNewPerson(){
        Person person = new Person();
        persons.add(person);
        return person;
        
        
    }
    
    
    public void printPerson(){
        for (Person person: persons){
            System.out.println(person.getfName()+person.getlName()+ person.getAge() + person.getPhoneNo());
            
        }
    }
    
    public Person authenticateUser(String userName, String password){
        for(Person person : persons){
            if(person.getUserName().equalsIgnoreCase(userName) && person.getPassword().equalsIgnoreCase(password)){
                return person;
            }
            
            
        } return null;
    }
}    
    
    
