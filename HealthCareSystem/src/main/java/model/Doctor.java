/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Anjali
 */
public class Doctor extends Person{
    
    
    static int count;
    int doctorId;
    String name;
    int yearsOfExperience; 

    public Doctor(int doctorId, String name) {
        this.count = count+1;
        this.doctorId = count;
        this.name = name;
    }
    
    
    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Doctor.count = count;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
}
