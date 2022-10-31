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
public class PatientDirectory {
    
    private ArrayList<PatData> PatDirectory;
    
    public PatientDirectory(){                            //this method is created whenever you can call docdirectory
        this.PatDirectory = new ArrayList<PatData>();
    }

    public ArrayList<PatData> getPatDirectory() {
        return PatDirectory;
    }

    public void setPatientDirectory(ArrayList<PatData> PatientDirectory) {
        this.PatDirectory = PatientDirectory;
    }
    
    public PatData addNewpatData(){
        PatData newdata1 = new PatData();    //it creates new data without any particular data in it 
        PatDirectory.add(newdata1);          //it adds empty new data to DocDirectory so that newdata is part of DocDirectory
        return newdata1;                      //it returns the reference to newdata
    }
    
    public void deletePat(PatData pd){
        PatDirectory.remove(pd);
    }
    
   
    
}

