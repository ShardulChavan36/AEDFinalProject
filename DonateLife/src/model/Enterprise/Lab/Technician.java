/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Enterprise.Lab;

import model.Organization.User;
import java.util.Date;

/**
 *
 * @author smiti
 */
public class Technician extends User {
    
    private String labName;
    
    public Technician(String uname, String pswd, String id, String name, String add, String gender, String contactNo, Date dob,String labName) {
        super(uname, pswd, id, name, add, gender, contactNo, dob);
        this.labName = labName;
    }

    public String getLabName() {
        return labName;
    }

    public void setLabName(String labName) {
        this.labName = labName;
    }
    
    
}
