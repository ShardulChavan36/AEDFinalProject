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
    
    public Clinic(String orgName, String orgRegistrationNo, String address, String username, String password) {
        super(orgName, orgRegistrationNo, address, username, password);
    }
    
}
