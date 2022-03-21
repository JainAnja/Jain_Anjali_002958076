package model;

import java.util.ArrayList;
import java.util.List;

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

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public void setPatients(ArrayList<Patient> patients) {
        this.patients = patients;
    }
    
    public Patient addNewPatient(){
         Patient patient = new Patient();
         patients.add(patient);
         return patient;  
    }
       
    public ArrayList<Patient> findAbNormalPatients(City city){
        ArrayList<Patient> unhealthyPatients = new ArrayList<>();
        for(Patient patient : this.patients){
            
            VitalSigns vs = patient.getEncounterHistory().getEncounters().get(patient.getEncounterHistory().getEncounters().size()-1).getVitalSigns();
            if(vs.getBloodPressure()> 100 || vs.getBloodPressure()<50 || vs.getHeartRate()>95 || vs.getHeartRate()<75
                    || vs.getTemperature()>98 || vs.getTemperature() <95){
                
                if(city == null) {
                    unhealthyPatients.add(patient);
                }
                else if (city!= null && patient.getHouse().getCommunity().getCity().getName().equalsIgnoreCase(city.getName())) {
                    unhealthyPatients.add(patient);
                }                       
            }          
            
        }
        
        return unhealthyPatients;
        
    }
    
    public Patient updatePatient(int input){
        for (Patient patient : patients){
            if(patient.getPatienId() == input){
                return patient;
                        
            }
        } return null; 
        
    }
    
    public ArrayList<Patient> findPatientWithAbnormalBloodPressure(City city){
        ArrayList<Patient> unhealthyPatients = new ArrayList<>();
        for(Patient patient : this.patients){
            VitalSigns vs = patient.getEncounterHistory().getEncounters().get(patient.getEncounterHistory().getEncounters().size()-1).getVitalSigns();
            if(vs.getBloodPressure()> 100 || vs.getBloodPressure()<50){
                if(city == null) {
                    unhealthyPatients.add(patient);
                }
                else if (city!= null && patient.getHouse().getCommunity().getCity().getName().equalsIgnoreCase(city.getName())) {
                    unhealthyPatients.add(patient);
                }
                
            }
        }
        
        return unhealthyPatients;
        
    }
    
   
    
    public ArrayList<Patient> findPatientWithAbnormalHeartRate(City city){
        ArrayList<Patient> unhealthyPatients = new ArrayList<>();
        for(Patient patient : this.patients){
            VitalSigns vs = patient.getEncounterHistory().getEncounters().get(patient.getEncounterHistory().getEncounters().size()-1).getVitalSigns();
            if(vs.getHeartRate()>95 || vs.getHeartRate()<75){
                if(city == null) {
                    unhealthyPatients.add(patient);
                }
                else if (city!= null && patient.getHouse().getCommunity().getCity().getName().equalsIgnoreCase(city.getName())) {
                    unhealthyPatients.add(patient);
                }
            }
        }
        
        return unhealthyPatients;
        
    }
    
    
    
    public ArrayList<Patient> findPatientWithAbnormalTemperature(City city){
        ArrayList<Patient> unhealthyPatients = new ArrayList<>();
        for(Patient patient : this.patients){
            VitalSigns vs = patient.getEncounterHistory().getEncounters().get(patient.getEncounterHistory().getEncounters().size()-1).getVitalSigns();
            if(vs.getTemperature()>98 || vs.getTemperature() <95){
                if(city == null) {
                    unhealthyPatients.add(patient);
                }
                else if (city!= null && patient.getHouse().getCommunity().getCity().getName().equalsIgnoreCase(city.getName())) {
                    unhealthyPatients.add(patient);
                }
                
            }
        }
        
        return unhealthyPatients;
        
    }
    
    public ArrayList<Patient> findPatientsFromCity(City city) {
        ArrayList<Patient> result = new ArrayList<>();
        for(Patient patient : this.patients) {
            if(patient.getHouse().getCommunity().getCity().getName().equalsIgnoreCase(city.getName())) {
                result.add(patient);
            }
        }
        
        return result;
    }
    
    public Person authenticateUser(String userName, String password){
        for(Patient patient : patients){
            if(patient.getUserName().equalsIgnoreCase(userName) && patient.getPassword().equalsIgnoreCase(password)){
                return patient;
            }
        } return null;
    }
    
    
    public boolean deletePatient(Patient patient) {
        
        for(Patient currentPatient : this.patients) {
            if(currentPatient.getPatienId() == patient.getPatienId()) {
                this.patients.remove(currentPatient);
                return true;
            }
        }
        return false;
    }
    
    
    
    public void printPatientDetails(){
        System.out.println("Patient list :" );
        for(Patient patient : patients){
            System.out.println(patient.getEncounterHistory());
        }
        
    }
    
    
    
    

}
