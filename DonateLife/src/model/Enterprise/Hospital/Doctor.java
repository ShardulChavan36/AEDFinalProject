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
public class Doctor extends User {

private String speciality;
private String hospname;

    public Doctor(String uname, String pswd, String id, String name, String add, String gender, String contactNo, Date dob, String speciality,String hospname) {
        super(uname, pswd, id, name, add, gender, contactNo, dob);
        this.speciality = speciality;
        this.hospname = hospname;
    }

    public String getHospname() {
        return hospname;
    }

    public void setHospname(String hospname) {
        this.hospname = hospname;
    }

    
    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
   

    
}
