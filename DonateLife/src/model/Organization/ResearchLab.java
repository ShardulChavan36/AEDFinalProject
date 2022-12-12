/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package model.Organization;

/**
 *
 * @author Shardul
 */
public class ResearchLab extends Organization{
    public String donorLabName;
  
    public ResearchLab(String enterpriseName, String registrationNo, String address, String username, String password,String orgName, String orgusername, String orgpassword){
    super(enterpriseName, registrationNo, address, username,password,orgName,orgusername,orgpassword);
    this.donorLabName=donorLabName;
    }

    public String getDonorLabName() {
        return donorLabName;
    }

    public void setDonorLabName(String donorLabName) {
        this.donorLabName = donorLabName;
    }

    
}
