/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Organization.Clinic;
import model.Location.Address;
import model.Organization.Organization;

/**
 *
 * @author shreyasrai
 */
public class Clinic extends Organization{
    
    public Clinic(String enterpriseName, String registrationNo, String address, String username, String password,String orgName, String orgusername, String orgpassword) {
        super(enterpriseName, registrationNo, address, username,password,orgName,orgusername,orgpassword);
    }
    
}