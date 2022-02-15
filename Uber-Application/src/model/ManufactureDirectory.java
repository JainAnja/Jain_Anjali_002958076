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
    
    ArrayList <Manufacture> supliers;

    public ManufactureDirectory(ArrayList<Manufacture> supliers) {
        this.supliers = supliers;
    }
    
    public ArrayList<Manufacture> getSupliers() {
        return supliers;
    }

    public void setSupliers(ArrayList<Manufacture> supliers) {
        this.supliers = supliers;
    }
    
    
}
