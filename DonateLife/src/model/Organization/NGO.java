/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Organization;

/**
 *
 * @author shreyasrai
 */
public class NGO extends Organization {
    private String survillance;
    private float donation;
    public NGO(String survillance, float donation, String enterpriseName, String registrationNo, String address, String username, String password, String orgName, String orgusername, String orgpassword) {
        super(enterpriseName, registrationNo, address, username, password, orgName, orgusername, orgpassword);
        this.survillance=survillance;
        this.donation=donation;
    }
    
}
