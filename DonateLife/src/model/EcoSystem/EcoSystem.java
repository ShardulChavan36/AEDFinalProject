/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.EcoSystem;

import model.Directories.EnterpriseDir.HospitalDirectory;

import model.Enterprise.Hospital.Doctor;
import model.Enterprise.Hospital.Hospital;
import model.Enterprise.Hospital.Nurse;
import model.Enterprise.Hospital.Patient;
import model.Organization.User;
import java.util.ArrayList;

/**
 *
 * @author Shardul
 */
public class EcoSystem {

    private static EcoSystem business;
    private HospitalDirectory hospitaldirectory;
    private ArrayList<Doctor> doctordirectory;
    private ArrayList<Nurse> nursedirectory;
    private ArrayList<Patient> patientdirectory;

    public EcoSystem() {
        hospitaldirectory = new HospitalDirectory();
        this.doctordirectory = new ArrayList();
        this.nursedirectory = new ArrayList();
        this.patientdirectory = new ArrayList();
    }

    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }

    public HospitalDirectory getHospitaldirectory() {
        return hospitaldirectory;
    }

    public void setHospitaldirectory(HospitalDirectory hospitaldirectory) {
        this.hospitaldirectory = hospitaldirectory;
    }

    public void addHospital(Hospital hosp) {
        System.out.println("addHospital() in ecosystem: " + hosp.getEnterpriseName());
        hospitaldirectory.addHospital(hosp);
    }

    public ArrayList<Doctor> getDoctordirectory() {
        return doctordirectory;
    }

    public void setDoctordirectory(ArrayList<Doctor> doctordirectory) {
        this.doctordirectory = doctordirectory;
    }

    public ArrayList<Nurse> getNursedirectory() {
        return nursedirectory;
    }

    public void setNursedirectory(ArrayList<Nurse> nursedirectory) {
        this.nursedirectory = nursedirectory;
    }

    public ArrayList<Patient> getPatientdirectory() {
        return patientdirectory;
    }

    public void setPatientdirectory(ArrayList<Patient> patientdirectory) {
        this.patientdirectory = patientdirectory;
    }


    public void addDoctor(Doctor doc) {
        try {
            doctordirectory.add(doc);
        } catch (Exception e) {
            this.doctordirectory = new ArrayList();
            doctordirectory.add(doc);
            e.printStackTrace();
        }
    }

    public void addNurse(Nurse nur) {
        try {
            nursedirectory.add(nur);
        } catch (Exception e) {
            this.nursedirectory = new ArrayList();
            nursedirectory.add(nur);
            e.printStackTrace();
        }
    }

    public void addPatient(Patient pat) {
        try {
            patientdirectory.add(pat);
        } catch (Exception e) {
            this.patientdirectory = new ArrayList();
            patientdirectory.add(pat);
            e.printStackTrace();
        }
    }
    public void deleteDoctor(String doctorUName) {
        for (Doctor d : doctordirectory) {
            if (d.getEmaildId().equals(doctorUName)) {
                doctordirectory.remove(d);
                return;
            }
        }
    }

    public void deleteNurse(String NurseUName) {
        for (Nurse n : nursedirectory) {
            if (n.getEmaildId().equals(NurseUName)) {
                nursedirectory.remove(n);
                return;
            }
        }
    }

    public void deletePatient(String PatientUName) {
        for (Patient p : patientdirectory) {
            if (p.getEmaildId().equals(PatientUName)) {
                patientdirectory.remove(p);
                return;
            }
        }
    }

    public Object loginCheck(String usr, String pass) {

        for (Doctor d : doctordirectory) {
            System.out.println("LoginCheck(doc): " + d.getEmaildId() + " " + d.getPswd());
            if (d.getEmaildId().equals(usr) && d.getPswd().equals(pass)) {
                return d;
            }
        }
         for (Hospital ho : hospitaldirectory.getHospitalList()) {
            System.out.println("LoginCheck(ho): " + ho.getUsername() + " " + ho.getPassword());
            if (ho.getUsername().equals(usr) && ho.getPassword().equals(pass)) {
                System.out.println("LoginCheck(): matched");
                return ho;
            }
        }

        for (Patient p : patientdirectory) {
            System.out.println("LoginCheck(doc): " + p.getEmaildId() + " " + p.getPswd());
            if (p.getEmaildId().equals(usr) && p.getPswd().equals(pass)) {
                return p;
            }
        }

       
        return null;
    }

    public Doctor findDoctorByUserName(String usrName) {
        for (Doctor d : doctordirectory) {
            if (d.getEmaildId().equals(usrName)) {
                return d;
            }
        }
        return null;
    }

}
