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
public class HospitalDirectory {
    private ArrayList<HospitalData> HospDirectory;
    
    public HospitalDirectory(){                            //this method is created whenever you can call docdirectory
        this.HospDirectory = new ArrayList<HospitalData>();
    }

    public ArrayList<HospitalData> getHospitalDirectory() {
        return HospDirectory;
    }

    public void setHospitalDirectory(ArrayList<HospitalData> HospitalDirectory) {
        this.HospDirectory = HospitalDirectory;
    }
    
    public HospitalData addNewHospData(){
        HospitalData newdata = new HospitalData();    //it creates new data without any particular data in it 
        HospDirectory.add(newdata);          //it adds empty new data to DocDirectory so that newdata is part of DocDirectory
        return newdata;                      //it returns the reference to newdata
    }
    
    public void deleteHosp(HospitalData hd){
        HospDirectory.remove(hd);
    }
    
}
