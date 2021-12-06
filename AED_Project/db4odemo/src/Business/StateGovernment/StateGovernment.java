/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.StateGovernment;

/**
 *
 * @author yashb
 */
public class StateGovernment {
    
    private String stateName;
    private String stateReserveAddress;
    private String fedName;
    private double currentStock;
    
    public StateGovernment(String stateName, String stateReserveAddress, String fedName, double currentStock){
        this.stateName = stateName;
        this.stateReserveAddress = stateReserveAddress;
        this.fedName = fedName;
        this.currentStock = currentStock;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getStateReserveAddress() {
        return stateReserveAddress;
    }

    public void setStateReserveAddress(String stateReserveAddress) {
        this.stateReserveAddress = stateReserveAddress;
    }

    public String getFedName() {
        return fedName;
    }

    public void setFedName(String fedName) {
        this.fedName = fedName;
    }

    public double getCurrentStock() {
        return currentStock;
    }

    public void setCurrentStock(double currentStock) {
        this.currentStock = currentStock;
    }
    
    @Override
    public String toString(){
        return stateName;
    }
}
