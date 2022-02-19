/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Anjali
 */


public class Utils {
    
    
    
    public static boolean isValidText(String input) {
        if (input != null && !input.isEmpty()) {
            return true;
        }
        return false;
    }

    public static boolean isValidYear(String input) {
        if (!input.isEmpty() && input.length() == 4) {
            return true;
        }

        return false;
    }
    
    public static LocalDate getRandomDate() {
        long minDay = LocalDate.of(2021, 01, 01).toEpochDay();
        long maxDay = LocalDate.of(2022, 12, 31).toEpochDay();
        long randomDay = ThreadLocalRandom.current().nextLong(minDay, maxDay);
        LocalDate randomDate = LocalDate.ofEpochDay(randomDay);
        return randomDate;
    }
    
    
    public static boolean isValidPrice(String input) {
        if (!input.isEmpty() && !input.contains("-") && !input.equalsIgnoreCase("0")) {
            return true;
        }

        return false;
    }
    
    
}
