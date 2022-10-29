/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author anupamaditya
 */
public class DoctorDirectory {
    
    private ArrayList<DocData> DocDirectory;
    
    public DoctorDirectory(){                            //this method is created whenever you can call docdirectory
        this.DocDirectory = new ArrayList<DocData>();
    }

    public ArrayList<DocData> getDoctorDirectory() {
        return DocDirectory;
    }

    public void setDoctorDirectory(ArrayList<DocData> DoctorDirectory) {
        this.DocDirectory = DoctorDirectory;
    }
    
    public DocData addNewDocData(){
        DocData newdata = new DocData();    //it creates new data without any particular data in it 
        DocDirectory.add(newdata);          //it adds empty new data to DocDirectory so that newdata is part of DocDirectory
        return newdata;                      //it returns the reference to newdata
    }
    
    public void deleteDoc(DocData dd){
        DocDirectory.remove(dd);
    }
    
   
    
}
