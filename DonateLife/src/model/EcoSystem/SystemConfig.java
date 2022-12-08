/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.EcoSystem;

/**
 *
 * @author Shardul
 */
public class SystemConfig {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance(); 
        return system;
    }
    
}