/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Enterprise.TransportLogistics;

import model.Enterprise.Enterprise;
import java.util.ArrayList;

/**
 *
 * @author smiti
 */
public class TransportLogistics extends Enterprise {
    
    private ArrayList<Handler> handlerdirectory;
    private ArrayList<Vehicle> vehicledirectory;

    public TransportLogistics(String enterpriseName, String registeryNumber, String address, String username, String password) {
        super(enterpriseName, registeryNumber, address, username, password);
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
    
    
    
}
