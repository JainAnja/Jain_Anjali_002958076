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
public class Patient extends Person {

    EncounterHistory encounterHistory;
    static int count;
    int patienId;
    String insuranceGroup;
    String memberId;

    public Patient() {
        this.encounterHistory = new EncounterHistory();
        this.count = count+1;
        this.patienId = count;

    }

    public EncounterHistory getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(EncounterHistory encounterHistory) {
        this.encounterHistory = encounterHistory;
    }

    public int getPatienId() {
        return patienId;
    }

    public void setPatienId(int patienId) {
        this.patienId = patienId;
    }

    public String getInsuranceGroup() {
        return insuranceGroup;
    }

    public void setInsuranceGroup(String insuranceGroup) {
        this.insuranceGroup = insuranceGroup;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    
    
    @Override
    public String toString() {
        return this.fName +" "+ this.lName ;
    }
    
    

}
