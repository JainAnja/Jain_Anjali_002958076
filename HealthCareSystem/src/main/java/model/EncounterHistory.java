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
public class EncounterHistory {
    
    
    ArrayList<Encounter> encounters;
    int numOfVisit;
    ArrayList<MedicalHistory> medicalHistory;
    
    
    

    public ArrayList<Encounter> getEncounters() {
        return encounters;
    }

    public void setEncounters(ArrayList<Encounter> encounters) {
        this.encounters = encounters;
    }

    public int getNumOfVisit() {
        return numOfVisit;
    }

    public void setNumOfVisit(int numOfVisit) {
        this.numOfVisit = numOfVisit;
    }

    public ArrayList<MedicalHistory> getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(ArrayList<MedicalHistory> medicalHistory) {
        this.medicalHistory = medicalHistory;
    }
    
    
    
    
    
}
