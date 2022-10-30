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
public class EncounterHistory {
    
    private  ArrayList<Encounter> EncHistory;
    
    public EncounterHistory(){                            //this method is created whenever you can call docdirectory
        this.EncHistory = new ArrayList<Encounter>();
    }

    public ArrayList<Encounter> getEncHistory() {
        return EncHistory;
    }

    public void setEncHistory(ArrayList<Encounter> EncHistory) {
        this.EncHistory = EncHistory;
    }

    
    
    public Encounter addNewEncounter(){
        Encounter newencounter = new Encounter();    //it creates new data without any particular data in it 
        EncHistory.add(newencounter);          //it adds empty new data to DocDirectory so that newdata is part of DocDirectory
        return newencounter;                      //it returns the reference to newdata
    }
    
    public void deleteEncounter(Encounter er){
        EncHistory.remove(er);
    }
    
}
