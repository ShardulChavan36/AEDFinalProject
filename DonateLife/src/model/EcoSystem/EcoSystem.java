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
import model.Enterprise.DonorInventory.DonorDetails;
import model.Enterprise.DonorInventory.DonorInventory;
import model.Enterprise.Lab.Technician;
import model.Enterprise.TransportLogistics.Handler;
import model.Enterprise.TransportLogistics.Vehicle;
import model.Organization.DonateEntity;

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
    private ArrayList<DonorDetails> donordirectory;
    private ArrayList<DonorInventory> donorbankdirectory;
    private ArrayList<Technician> techdirectory;
    private ArrayList<DonateEntity> donateEntityList;
    private ArrayList<Handler> handlerdirectory;
    private ArrayList<Vehicle> vehicledirectory;

    public EcoSystem() {
        hospitaldirectory = new HospitalDirectory();
        this.doctordirectory = new ArrayList();
        this.nursedirectory = new ArrayList();
        this.patientdirectory = new ArrayList();
        this.techdirectory = new ArrayList();
        this.donordirectory = new ArrayList();
        this.donorbankdirectory = new ArrayList();
        this.donateEntityList = new ArrayList();
        this.handlerdirectory = new ArrayList();
        this.vehicledirectory = new ArrayList();
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
    public ArrayList<DonorDetails> getDonordirectory() {
        try {
            return donordirectory;
        } catch (Exception e) {
            this.donordirectory = new ArrayList();
            return donordirectory;
        }

    }

    public void setDonordirectory(ArrayList<DonorDetails> donordirectory) {
        this.donordirectory = donordirectory;
    }

    public ArrayList<DonorInventory> getDonorbankdirectory() {
        return donorbankdirectory;
    }

    public void setDonorbankdirectory(ArrayList<DonorInventory> donorbankdirectory) {
        this.donorbankdirectory = donorbankdirectory;
    }

    public static EcoSystem getBusiness() {
        return business;
    }

    public static void setBusiness(EcoSystem business) {
        EcoSystem.business = business;
    }

    public ArrayList<Technician> getTechdirectory() {
        return techdirectory;
    }

    public void setTechdirectory(ArrayList<Technician> techdirectory) {
        this.techdirectory = techdirectory;
    }

    public ArrayList<DonateEntity> getDonateEntityList() {
        return donateEntityList;
    }

    public void setDonateEntityList(ArrayList<DonateEntity> donateEntityList) {
        this.donateEntityList = donateEntityList;
    }

    public ArrayList<Handler> getHandlerdirectory() {
        return handlerdirectory;
    }

    public void setHandlerdirectory(ArrayList<Handler> handlerdirectory) {
        this.handlerdirectory = handlerdirectory;
    }

    public ArrayList<Vehicle> getVehicledirectory() {
        return vehicledirectory;
    }

    public void setVehicledirectory(ArrayList<Vehicle> vehicledirectory) {
        this.vehicledirectory = vehicledirectory;
    }
    

    
    
    public void addDonor(DonorDetails donor) {
        try {
            donordirectory.add(donor);
        } catch (Exception e) {
            this.donordirectory = new ArrayList();
            donordirectory.add(donor);

        }
    }

    public void addDonorBank(DonorInventory donor) {
        try {
            donorbankdirectory.add(donor);
        } catch (Exception e) {
            this.donorbankdirectory = new ArrayList();
            donorbankdirectory.add(donor);
            e.printStackTrace();
        }
    }
     public void addTech(Technician tech) {
        try {
            techdirectory.add(tech);
        } catch (Exception e) {
            this.techdirectory = new ArrayList();
            techdirectory.add(tech);

        }
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
    public void addDonateEntity(DonateEntity de) {
        try {
            donateEntityList.add(de);

        } catch (Exception e) {
            this.donateEntityList = new ArrayList();
            donateEntityList.add(de);
        }
    }
public void addHandler(Handler handler) {
        try {
            handlerdirectory.add(handler);
        } catch (Exception e) {
            this.handlerdirectory = new ArrayList();
            handlerdirectory.add(handler);

        }
    }

    public void addVehicle(Vehicle vehicle) {
        try {
            vehicledirectory.add(vehicle);
        } catch (Exception e) {
            this.vehicledirectory = new ArrayList();
            vehicledirectory.add(vehicle);

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
    public void deleteDonorBank(String donorBankUName) {

        for (DonorInventory n : donorbankdirectory) {
            System.out.println("donorb " + n.getUsername());
            if (n.getUsername().equals(donorBankUName)) {
                System.out.println("found");
                donorbankdirectory.remove(n);
                return;
            }
        }
    }

    public void deleteDonor(String donorName) {
        for (DonorDetails n : donordirectory) {
            if (n.getEmaildId().equals(donorName)) {
                donordirectory.remove(n);
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
        for (Technician tech : techdirectory) {
            //System.out.println("LoginCheck(doc): " + don.getUname() + " " + don.getPswd());
            if (tech.getEmaildId().equals(usr) && tech.getPswd().equals(pass)) {
                return tech;
            }
        }

        for (DonorDetails don : donordirectory) {
            //System.out.println("LoginCheck(doc): " + don.getUname() + " " + don.getPswd());
            if (don.getEmaildId().equals(usr) && don.getPswd().equals(pass)) {
                return don;
            }
        }
        for (DonorInventory don : donorbankdirectory) {
            //System.out.println("LoginCheck(doc): " + don.getUname() + " " + don.getPswd());
            if (don.getUsername().equals(usr) && don.getPassword().equals(pass)) {
                return don;
            }
        }
        for (Handler don : handlerdirectory) {
            //System.out.println("LoginCheck(doc): " + don.getUname() + " " + don.getPswd());
            if (don.getEmaildId().equals(usr) && don.getPswd().equals(pass)) {
                return don;
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

     public void deleteDonorBYuserName(String doctorUName) {
        for (DonorDetails n : donordirectory) {
            if (n.getEmaildId().equals(doctorUName)) {
//                donordirectory.remove(n);
                return;
            }
        }
    }
     public void deleteHandler(String HUname) {

        for (Handler n : handlerdirectory) {
            if (n.getEmaildId().equals(HUname)) {
                handlerdirectory.remove(n);
                return;
            }
        }
    }

    public void deleteVehicle(String vNumber) {

        for (Vehicle n : vehicledirectory) {
            if (n.getVehicleNo().equals(vNumber)) {
                vehicledirectory.remove(n);
                return;
            }
        }
    }

    public User findPatientByUserName(String patUname) {
        for (Patient p : patientdirectory) {
            if (p.getEmaildId().equals(patUname)) {
                return p;
            }
        }
        for (DonorDetails p : donordirectory) {
            if (p.getEmaildId().equals(patUname)) {
                return p;
            }
        }
        return null;
    }
    private Technician findTechnicianByUname(String tech) {
        for (Technician d : techdirectory) {
            if (d.getEmaildId().equals(tech)) {
                return d;
            }
        }
        return null;
    }
    public Vehicle getVehicleByNumber(String vecNo) {

        System.out.println("vec no:" + vecNo.substring(0, vecNo.indexOf("|")));
        for (Vehicle v : vehicledirectory) {
            if (v.getVehicleNo().matches(vecNo.substring(0, vecNo.indexOf("|")))) {
                return v;

            }
        }
        return null;
    }
    private Handler findHandlerByUname(String handler) {
        for (Handler d : handlerdirectory) {
             System.out.println("print :"+d.getEmaildId());
            if (d.getEmaildId().toLowerCase().equals(handler.toLowerCase())) {
                System.out.println("print found:"+d.getEmaildId());
                return d;
            }
        }
        return null;
    }
public void generateRequesting(String donateEntity, String handler, String tech, Hospital rec, String doc, String recPat) {
        Handler h = findHandlerByUname(handler);
        Technician t = findTechnicianByUname(tech);
        Doctor d = findDoctorByUserName(doc);
        Patient p = (Patient) findPatientByUserName(recPat);
        for (DonateEntity de : donateEntityList) {
            try {
                if (de.getId().equals(donateEntity)) {
                    de.setHandler(h);
                    de.setTechnician(t);
                    de.setReceiverEnterprise(rec);
                    de.setReceiverDoctor(d);
                    de.setReceiverPatient(p);
                    de.setStatus("Requested");
                    return;
                }
            } catch (Exception e) {

            }
        }

    }

}
