/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Enterprise.Lab;

import model.Location.Address;
import model.Enterprise.Enterprise;
import java.util.ArrayList;

/**
 *
 * @author smiti
 */
public class Lab extends Enterprise{
    
    private ArrayList<Technician> techdirectory;
    
    public Lab(String enterpriseName, String registrationNo, String address, String username, String password) {
        super(enterpriseName, registrationNo, address, username, password);
        this.techdirectory = new ArrayList();
    }

    public ArrayList<Technician> getTechdirectory() {
        return techdirectory;
    }

    public void setTechdirectory(ArrayList<Technician> techdirectory) {
        this.techdirectory = techdirectory;
    }
        @Override
    public String toString(){
        return String.valueOf(enterpriseName);
    }
}
