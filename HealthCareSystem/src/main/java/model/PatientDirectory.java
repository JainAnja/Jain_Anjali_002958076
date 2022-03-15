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
public class PatientDirectory {
    
    ArrayList<Patient> patients;

    public PatientDirectory() {
        this.patients = new ArrayList<>();
    }
    
    
//    public ArrayList<Patient> findAbNormalPatient(){
//        ArrayList<Patient> unhealthyPatients = new ArrayList<>();
//        for(Patient patient : this.patients){
//            if(patient.getBloodPressure()> 100 || patient.getBloodPressure()<50 || patient.getHeartRate()>95 || patient.getHeartRate()<75
//                    || patient.getTemperature()>98 || patient.getTemperature() <95){
//                unhealthyPatients.add(patient);
//                
//            }
//        }
//        
//        return unhealthyPatients;
//        
//    }
//    
    
    public Patient addNewPatient(){
         Patient patient = new Patient();
         patients.add(patient);
         return patient;
         
    }
    
    
    
    

}
