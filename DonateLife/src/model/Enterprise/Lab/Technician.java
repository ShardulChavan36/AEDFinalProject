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
 * @author shreyasrai
 */
public class Technician extends User {
    
    private String labName;
    public String orgName;
    
    public Technician(String uname, String pswd, String id, String name, String add, String gender, String contactNo, Date dob,String labName,String orgName) {
        super(uname, pswd, id, name, add, gender, contactNo, dob);
        this.labName = labName;
        this.orgName=orgName;
    }

    public String getLabName() {
        return labName;
    }

    public void setLabName(String labName) {
        this.labName = labName;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }
    
    @Override
    public String toString(){
        return String.valueOf(name);
    }
    
}
