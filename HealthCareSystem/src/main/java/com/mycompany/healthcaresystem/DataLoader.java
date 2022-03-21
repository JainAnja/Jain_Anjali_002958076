/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.healthcaresystem;

import java.util.Random;
import com.github.javafaker.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import model.City;
import model.Community;
import model.Encounter;
import model.HospitalSystem;
import model.House;
import model.Patient;
import model.Person;
import model.VitalSigns;

/**
 *
 * @author Anjali
 */
public class DataLoader {

    private HospitalSystem system;
    Faker faker = new Faker();
    Random random = new Random();

    public DataLoader(HospitalSystem system) {
        this.system = system;

        populateCitiesAndCommunities();
        populatePerson();
        populateDoctor();

    }

    public void populatePerson() {

        for (int i = 0; i < 20; i++) {
            Patient patient = this.system.getPatientDirectory().addNewPatient();
            patient.setfName(faker.name().firstName());
            patient.setlName(faker.name().lastName());
            patient.setAge(faker.number().numberBetween(1, 90));
            patient.setPhoneNo(String.valueOf(faker.phoneNumber()));
            patient.setUserName("u" + i);
            patient.setPassword("p" + i);
            Community community = this.system.getCities().get(random.nextInt(4)).getCommunities().get(random.nextInt(4));
            House house = community.addNewHouse(faker.address().fullAddress(), patient);
            house.setCommunity(community);
            patient.setHouse(house);
            

            for (int vital = 0; vital < 5; vital++) {
                Encounter encounter = patient.getEncounterHistory().addNewEncounter(Utils.getRandomDate(), random.nextInt(1000));

                VitalSigns vs = new VitalSigns(faker.number().numberBetween(70, 110), faker.number().numberBetween(40, 120),
                        faker.number().numberBetween(95, 103));
                vs.setEncounter(encounter);
                encounter.setVitalSigns(vs);
            }

            VitalSigns vsd = patient.getEncounterHistory().getEncounters().get(4).getVitalSigns();
            System.out.println(patient.getPatienId() + " " + vsd.getBloodPressure() + " " + vsd.getHeartRate() + " " + vsd.getTemperature());
        }

    }

    public void populateDoctor() {
        for (int i = 0; i < 5; i++) {
            Person person = this.system.getPersonDirectory().addNewPerson();
            person.setfName(faker.name().firstName());
            person.setlName(faker.name().lastName());
            person.setAge(faker.number().numberBetween(1, 70));
            person.setPhoneNo(String.valueOf(faker.phoneNumber()));

            person.setUserName("d" + i);
            person.setPassword("p" + i);
            System.out.println(person.getfName());

        }
    }

    public String getRandomSymptom() {
        ArrayList<String> symptoms = new ArrayList<>(Arrays.asList("Fever", "Cold", "diarrhea", "nausea"));
        return symptoms.get(new Random().nextInt(symptoms.size()));

    }

    public String getRandomAllergy() {
        ArrayList<String> allergy = new ArrayList<>(Arrays.asList("Dust Allergy", "Food Allergy", "Pet Allergy"));
        return allergy.get(new Random().nextInt(allergy.size()));

    }

    public void populateCitiesAndCommunities() {

        for (int i = 0; i < 5; i++) {
            City city = this.system.addNewCity(faker.address().state());
            for (int j = 0; j < 5; j++) {
                Community community = city.addNewCommunity(faker.country().capital());
                community.setCity(city);
            }
        }
    }

}
