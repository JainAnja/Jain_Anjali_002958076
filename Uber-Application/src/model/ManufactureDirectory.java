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
public class ManufactureDirectory {
    
    ArrayList <Manufacture> manufactureList;

    public ManufactureDirectory() {
        this.manufactureList = new ArrayList<>();
    }
    
    public ArrayList<Manufacture> getManufactureList() {
        return manufactureList;
    }
    
    
    public Manufacture addNewManufacture(){
        Manufacture manufacture = new Manufacture();
        manufactureList.add(manufacture);
        return manufacture;
    }
    
    
    
    public void removeManufacture(Manufacture manuf){
        manufactureList.remove(manuf);
    }
    
    
    public Manufacture searchManufacture(String ManufactureName){
        
        
        for(Manufacture manufacture : manufactureList){
            if(manufacture.getManufactureName().equalsIgnoreCase(ManufactureName))
                
                return manufacture;
        }
        return null;
    }

    
    
}
