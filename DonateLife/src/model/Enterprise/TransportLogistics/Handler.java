/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Enterprise.TransportLogistics;

import model.Organization.User;
import java.util.Date;

/**
 *
 * @author Mayur
 */
public class Handler extends User {
    
    private Vehicle vehicle;
    
    public Handler(String uname, String pswd, String id, String name, String add, String gender, String contactNo, Date dob,Vehicle vehicle) {
        super(uname, pswd, id, name, add, gender, contactNo, dob);
        this.vehicle = vehicle;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
  
    
}
