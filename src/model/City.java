/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anupamaditya
 */
public class City {
    
    private String City;
    private String country;
    private List<Community> communityList;
    
    
    public City(){
        communityList = new ArrayList<>();
    }

    public List<Community> getCommunityList() {
        return communityList;
    }

    public void setCommunityList(List<Community> communityList) {
        this.communityList = communityList;
    }
    
    

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }
    @Override    // we are overriding toSTring that returns DocID. we will be telling Java that overriding something that inherits 
    public String toString(){    
        return City;
    }
    
   
}
