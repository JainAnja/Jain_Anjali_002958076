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
public class Patient {
    
    
    ArrayList<EncounterHistory> encounterHistory;
    Person person;
  

    public Patient() {
        this.encounterHistory = encounterHistory;
        this.person = person;
        
    }

    public ArrayList<EncounterHistory> getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(ArrayList<EncounterHistory> encounterHistory) {
        this.encounterHistory = encounterHistory;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

   
    
    

    
    
}
