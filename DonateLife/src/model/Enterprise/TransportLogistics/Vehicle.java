/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Enterprise.TransportLogistics;

/**
 *
 * @author smiti
 */
public class Vehicle {

    private String vehicleName;
    private String vehicleNo;
    private String vehicleType;
    private String desc;

    public Vehicle(String vehicleName, String vehicleNo, String vehicleType, String desc) {
        this.vehicleName = vehicleName;
        this.vehicleNo = vehicleNo;
        this.vehicleType = vehicleType;
        this.desc = desc;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    @Override
    public String toString(){
        return String.valueOf(vehicleName);
    }

}
