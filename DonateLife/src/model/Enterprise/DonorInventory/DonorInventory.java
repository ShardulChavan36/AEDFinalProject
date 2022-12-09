/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Enterprise.DonorInventory;

import model.Location.Address;
import model.Enterprise.Enterprise;
import java.util.ArrayList;

/**
 *
 * @author harshaljaiswal
 */
public class DonorInventory extends Enterprise {

    private ArrayList<DonorDetails> donordirectory;
    private ArrayList<Blood> blooddirectory;
    private ArrayList<Organ> organdirectory;

    public DonorInventory(String enterpriseName, String registrationNo, String address, String username, String password) {
        super(enterpriseName, registrationNo, address, username, password);

        this.donordirectory = new ArrayList();
        this.blooddirectory = new ArrayList();
        this.organdirectory = new ArrayList();
    }

    public ArrayList<DonorDetails> getDonordirectory() {
        return donordirectory;
    }

    public void setDonordirectory(ArrayList<DonorDetails> donordirectory) {
        this.donordirectory = donordirectory;
    }

    public ArrayList<Blood> getBlooddirectory() {
        return blooddirectory;
    }

    public void setBlooddirectory(ArrayList<Blood> blooddirectory) {
        this.blooddirectory = blooddirectory;
    }

    public ArrayList<Organ> getOrgandirectory() {
        return organdirectory;
    }

    public void setOrgandirectory(ArrayList<Organ> organdirectory) {
        this.organdirectory = organdirectory;
    }



}
