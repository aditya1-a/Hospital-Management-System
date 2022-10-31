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
public class CommunityDirectory {

    private ArrayList<Community> communities;

    public ArrayList<Community> getCommunities() {
        return communities;
    }

    public void setCommunities(ArrayList<Community> communities) {
        this.communities = communities;
    }
    
  
    public CommunityDirectory(){
        communities = new ArrayList<>();
        
        Community cm1 = new Community();
        cm1.setCommunityName("Jamaica Plain");
        communities.add(cm1);
        
        Community cm2 = new Community();
        cm2.setCommunityName("Mission Hill");
        communities.add(cm2);
        
        Community cm3 = new Community();
        cm3.setCommunityName("Riverway");
        communities.add(cm3);
        
        Community cm4 = new Community();
        cm4.setCommunityName("Roxbury");
        communities.add(cm4);
        
        Community cm5 = new Community();
        cm5.setCommunityName("Longwood");
        communities.add(cm5);
        
        Community cm6 = new Community();
        cm6.setCommunityName("Tremont");
        communities.add(cm6);
        
        
        
    }
   
}
