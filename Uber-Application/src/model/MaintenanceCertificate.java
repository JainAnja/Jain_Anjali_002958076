/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author Anjali
 */
public class MaintenanceCertificate {
    
    private LocalDate expieryDate;
    private LocalDate serviceDate;

    public MaintenanceCertificate(LocalDate expieryDate, LocalDate serviceDate) {
        this.expieryDate = expieryDate;
        this.serviceDate = serviceDate;
    }
    
    

    public LocalDate getExpieryDate() {
        return expieryDate;
    }

    public void setExpieryDate(LocalDate expieryDate) {
        this.expieryDate = expieryDate;
    }

    public LocalDate getServiceDate() {
        return serviceDate;
    }

    public void setServiceDate(LocalDate serviceDate) {
        this.serviceDate = serviceDate;
    }
    
    
    
    
}
