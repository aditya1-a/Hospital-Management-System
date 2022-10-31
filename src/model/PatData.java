/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;
import java.util.Date;


/**
 *
 * @author anupamaditya
 */
public class PatData extends PersonModel{
     private String PatientID;
     private double heightInCms;
     private double weightInKgs;
     private Date VisitingDate;
     private List<Community> communityList;

    
     

    public Date getVisitingDate() {
        return VisitingDate;
    }

    public void setVisitingDate(Date VisitingDate) {
        this.VisitingDate = VisitingDate;
    }
     

    public String getPatientID() {
        return PatientID;
    }

    public void setPatientID(String PatientID) {
        this.PatientID = PatientID;
    }

    public double getHeightInCms() {
        return heightInCms;
    }

    public void setHeightInCms(double heightInCms) {
        this.heightInCms = heightInCms;
    }

    public double getWeightInKgs() {
        return weightInKgs;
    }

    public void setWeightInKgs(double weightInKgs) {
        this.weightInKgs = weightInKgs;
    }
     
    @Override    // we are overriding toSTring that returns DocID. we will be telling Java that overriding something that inherits 
    public String toString(){    
        return PatientID;
    }
}
