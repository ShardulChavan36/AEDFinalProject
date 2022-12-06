/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Organization;

import model.Location.Address;
import java.util.Date;

/**
 *
 * @author Shardul
 */
public class User {

private String emaildId;
private String pswd;
private String id;
private String name;
private String add;
private String gender;
private String contactNo;
private Date dob;

    public User(String emaildId, String pswd, String id, String name, String add, String gender, String contactNo, Date dob) {
        this.emaildId = emaildId;
        this.pswd = pswd;
        this.id = id;
        this.name = name;
        this.add = add;
        this.gender = gender;
        this.contactNo = contactNo;
        this.dob = dob;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getEmaildId() {
        return emaildId;
    }

    public void setEmaildId(String emaildId) {
        this.emaildId = emaildId;
    }

    public String getPswd() {
        return pswd;
    }

    public void setPswd(String pswd) {
        this.pswd = pswd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    
}
