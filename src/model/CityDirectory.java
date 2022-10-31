/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author anupamaditya
 */
public class CityDirectory {
    
    private ArrayList<City> cities;
   
    
    
    
    
    public CityDirectory(){
        cities = new ArrayList<>();
        
        City c1 = new City();
        c1.setCity("Boston");
        c1.setCountry("USA");
        cities.add(c1);
        
        City c2 = new City();
        c2.setCity("New jersey");
        c2.setCountry("USA");
        cities.add(c2);
        
        City c3 = new City();
        c3.setCity("Texas");
        c3.setCountry("USA");
        cities.add(c3);
        
    }

     
    
    
    public ArrayList<City> getCities() {
        return cities;
    }

    public void setCities(ArrayList<City> cities) {
        this.cities = cities;
    }

    
    
    
    
}
