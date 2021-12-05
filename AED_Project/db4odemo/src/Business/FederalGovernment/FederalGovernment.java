/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.FederalGovernment;

import java.util.HashMap;

/**
 *
 * @author Karan
 */
public class FederalGovernment {
    private String fedName;
    private String fedReserveAddress;
    private double currentStock;
    //private HashMap<String, Integer> vaccineStock;
    
  
    
    public FederalGovernment(String fedName, String fedReserveAddress, double currentStock){
        this.fedName = fedName;
        this.fedReserveAddress = fedReserveAddress;
        this.currentStock = currentStock;
    }

    public String getFedName() {
        return fedName;
    }

    public void setFedName(String fedName) {
        this.fedName = fedName;
    }

    public String getFedReserveAddress() {
        return fedReserveAddress;
    }

    public void setFedReserveAddress(String fedReserveAddress) {
        this.fedReserveAddress = fedReserveAddress;
    }

    public double getCurrentStock() {
        return currentStock;
    }

    public void setCurrentStock(double currentStock) {
        this.currentStock = currentStock;
    }  
}
