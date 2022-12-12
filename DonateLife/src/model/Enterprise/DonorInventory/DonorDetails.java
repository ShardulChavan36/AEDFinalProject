/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Enterprise.DonorInventory;

import model.Organization.User;
import java.util.Date;

/**
 *
 * @author shreyasrai
 */
public class DonorDetails extends User {

    private String inventoryName;
    private String medicalHis;
    public DonorDetails(String uname, String pswd, String id, String name, String add, String gender, String contactNo, Date dob,String inventoryName,String medicalHis) {
        super(uname, pswd, id, name, add, gender, contactNo, dob);
        this.inventoryName = inventoryName;
        this.medicalHis=medicalHis;
    }

    public String getInventoryName() {
        return inventoryName;
    }

    public void setInventoryName(String inventoryName) {
        this.inventoryName = inventoryName;
    }

    public String getMedicalHis() {
        return medicalHis;
    }

    public void setMedicalHis(String medicalHis) {
        this.medicalHis = medicalHis;
    }
    @Override
    public String toString(){
        return String.valueOf(name);
    }
    
}
