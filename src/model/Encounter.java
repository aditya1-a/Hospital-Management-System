/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author anupamaditya
 */
public class Encounter {
    private PatData VisitingDate;
    private VitalSigns VitalSigns;
    private PatData PatientID;
    private PatData PatientName;

    public PatData getVisitingDate() {
        return VisitingDate;
    }

    public void setVisitingDate(PatData VisitingDate) {
        this.VisitingDate = VisitingDate;
    }

    public VitalSigns getVitalSigns() {
        return VitalSigns;
    }

    public void setVitalSigns(VitalSigns VitalSigns) {
        this.VitalSigns = VitalSigns;
    }

    public PatData getPatientID() {
        return PatientID;
    }

    public void setPatientID(PatData PatientID) {
        this.PatientID = PatientID;
    }

    public PatData getPatientName() {
        return PatientName;
    }

    public void setPatientName(PatData PatientName) {
        this.PatientName = PatientName;
    }
    
    
}
