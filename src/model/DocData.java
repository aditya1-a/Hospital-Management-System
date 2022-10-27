/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author anupamaditya
 */
public class DocData extends PersonModel {
    
    private String DocID;
    private String department;
    private Date JoiningDate;

    public String getDocID() {
        return DocID;
    }

    public void setDocID(String DocID) {
        this.DocID = DocID;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Date getJoiningDate() {
        return JoiningDate;
    }

    public void setJoiningDate(Date JoiningDate) {
        this.JoiningDate = JoiningDate;
    }
}
    