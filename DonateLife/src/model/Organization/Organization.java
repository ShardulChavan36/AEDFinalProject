/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package model.Organization;

/**
 *
 * @author chava
 */
public class Organization {
    private String orgName;
    private String orgRegistrationNo;
    private String address;
    private String orgUsername;
    private String password;

    public Organization(String orgName, String orgRegistrationNo, String address, String username, String password) {
        this.orgName = orgName;
        this.orgRegistrationNo = orgRegistrationNo;
        this.address = address;
        this.orgUsername = username;
        this.password = password;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    

}
