/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Enterprise.Hospital;

import model.Location.Address;
import model.Organization.User;
import java.util.Date;

/**
 *
 * @author shreyasrai
 */
public class Patient extends User{
    
    private String diagnosis;
    private String hospname;
    
    public Patient(String uname, String pswd, String id, String name, String add, String gender, String contactNo, Date dob,String diagnosis,String hospname) {
        super(uname, pswd, id, name, add, gender, contactNo, dob);
        this.diagnosis = diagnosis;
        this.hospname = hospname;
    }

    public String getHospname() {
        return hospname;
    }

    public void setHospname(String hospname) {
        this.hospname = hospname;
    }
    
    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
     
}
