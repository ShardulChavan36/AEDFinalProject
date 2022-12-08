/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Directories.EnterpriseDir;

import model.Enterprise.Hospital.Hospital;
import java.util.ArrayList;

/**
 *
 * @author Shardul
 */
public class HospitalDirectory {

    private ArrayList<Hospital> hospitalList;

    public ArrayList<Hospital> getHospitalList() {
        return hospitalList;
    }

    public void setHospitalList(ArrayList<Hospital> hospitalList) {
        this.hospitalList = hospitalList;
    }

    public HospitalDirectory() {
        hospitalList = new ArrayList();
    }

    public void addHospital(Hospital hospital) {
        hospitalList.add(hospital);
    }

    public void removeHospital(String id) {

        for (Hospital hosp : hospitalList) {
            if (hosp.getRegistrationNo() == id) {
                hospitalList.remove(hosp);
            }
        }

    }

    public Hospital findHospital(String hospitalName) {
        System.out.println("findHospital() "+hospitalName);
        for (Hospital hosp : hospitalList) {
            if (hosp.getEnterpriseName() == hospitalName) {
                return hosp;
            }
        }
        return null;
    }

}
