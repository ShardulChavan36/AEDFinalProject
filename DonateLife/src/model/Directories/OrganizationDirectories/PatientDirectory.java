package model.Directories.OrganizationDirectories;

import model.Enterprise.Hospital.Hospital;
import model.Enterprise.Hospital.Patient;

import java.util.ArrayList;

public class PatientDirectory {
    ArrayList<Patient> patientList;

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }

    public PatientDirectory(){
        patientList = new ArrayList();
    }

    public void addPatient(Patient patient) {
        patientList.add(patient);
    }

    public void removePatient(String usrName) {

        for (Patient pat : patientList) {
            if (pat.getEmaildId() == usrName) {
                patientList.remove(pat);
                return;
            }
        }

    }

    public Patient findPatient(String usrName) {
        for (Patient pat : patientList) {
            if (pat.getEmaildId() == usrName) {
                return pat;
            }
        }

        return null;
    }


}
