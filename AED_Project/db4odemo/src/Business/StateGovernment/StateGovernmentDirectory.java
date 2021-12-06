/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.StateGovernment;

import Business.FederalGovernment.FederalGovernment;
import java.util.ArrayList;

/**
 *
 * @author yashb
 */
public class StateGovernmentDirectory {
    
    private ArrayList<StateGovernment> stateGovernmentDirectory;
    
    public StateGovernmentDirectory(){
        stateGovernmentDirectory = new ArrayList();
    }

    public ArrayList<StateGovernment> getStateGovernmentDirectory() {
        return stateGovernmentDirectory;
    }

    public void setStateGovernmentDirectory(ArrayList<StateGovernment> stateGovernmentDirectory) {
        this.stateGovernmentDirectory = stateGovernmentDirectory;
    }
    
    public StateGovernment getStateGovernment(String name){
    for(StateGovernment sg: stateGovernmentDirectory){
        if(sg.getStateName().equalsIgnoreCase(name)){
            return sg;
            }
        }
        return null;
    }
    
    public StateGovernment addNewStateGovernment(String stateName, String stateReserveAddress, String fedName, double currentStock){
    StateGovernment sg = new StateGovernment(stateName, stateReserveAddress, fedName, currentStock);
    stateGovernmentDirectory.add(sg);
    return sg;
}
    
    public void removeStateGovernment(StateGovernment sg){
    stateGovernmentDirectory.remove(sg);
}
    
}
