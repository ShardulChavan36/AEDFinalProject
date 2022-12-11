/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package model.Organization;

import model.Enterprise.Enterprise;

/**
 *
 * @author shreyasrai
 */
public class Organization extends Enterprise{
    private String orgName;
    private String orgRegistrationNo;
    private String address;
    private String orgUsername;
    private String orgpassword;

    public Organization(String enterpriseName, String registrationNo, String address, String username, String password,String orgName, String orgusername, String orgpassword) {
        super(enterpriseName, registrationNo, address, username, password);
        this.orgName = orgName;
        this.orgUsername = orgusername;
        this.orgpassword = orgpassword;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getOrgRegistrationNo() {
        return orgRegistrationNo;
    }

    public void setOrgRegistrationNo(String orgRegistrationNo) {
        this.orgRegistrationNo = orgRegistrationNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOrgUsername() {
        return orgUsername;
    }

    public void setOrgUsername(String orgUsername) {
        this.orgUsername = orgUsername;
    }

    public String getOrgpassword() {
        return orgpassword;
    }

    public void setOrgpassword(String orgpassword) {
        this.orgpassword = orgpassword;
    }

    
    
    

}
