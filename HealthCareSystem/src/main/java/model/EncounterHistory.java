package model;

import java.time.LocalDate;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Anjali
 */
public class EncounterHistory {
    
    
    ArrayList<Encounter> encounters;
    
    public EncounterHistory() {
        this.encounters = new ArrayList();
       
    }
    
    
    
    public ArrayList<Encounter> getEncounters() {
        return encounters;
    }

    public void setEncounters(ArrayList<Encounter> encounters) {
        this.encounters = encounters;
    }

    
    public Encounter addNewEncounter( LocalDate date, double payment){
        Encounter enc = new Encounter(date, payment);
        encounters.add(enc);
        return enc;
    }
    
    
    
    
}
