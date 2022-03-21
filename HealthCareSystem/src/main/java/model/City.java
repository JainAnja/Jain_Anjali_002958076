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
public class City {

    String name;
    ArrayList<Community> communities;
    

    public City(String name) {
        this.communities = new ArrayList<>();
        this.name = name;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
    public ArrayList<Community> getCommunities() {
        return communities;
    }

    public void setCommunities(ArrayList<Community> communities) {
        this.communities = communities;
    }
    
    
    public Community addNewCommunity(String name){
        Community community = new Community(name);
         communities.add(community);
        return community;
    }
    
    public Community getCommunityByName(String name) {
        for (Community community: this.getCommunities()) {
            if (community.getName().equalsIgnoreCase(name)) {
                return community;
            }
        }
        
        return null;
    }

    @Override
    public String toString() {
        return ""+ name;
    }
    
    
    
}
