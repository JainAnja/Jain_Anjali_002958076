/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Anjali
 */
public class ServiceRecordHistory {
    
    private ArrayList<ServiceRecord> history;
    
    
    public ServiceRecordHistory(){
        this.history = new ArrayList<ServiceRecord>();
    }
    
    public ArrayList<ServiceRecord> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<ServiceRecord> history) {
        this.history = history;
    }
    
    
    
    
    public ServiceRecord addNewRecords(String date, String charges, String parts){
        ServiceRecord sr = new ServiceRecord(date, charges, parts);
        history.add(sr);
        return sr;
        
    }
    
    
    public void deleteRecords(ServiceRecord serviceRecord){
        history.remove(serviceRecord);
    }

   
    
    
    
    
    
    
    
    
}
