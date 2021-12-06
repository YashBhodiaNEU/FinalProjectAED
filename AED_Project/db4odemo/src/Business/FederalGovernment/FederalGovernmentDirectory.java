/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.FederalGovernment;

import java.util.ArrayList;

/**
 *
 * @author Karan
 */
public class FederalGovernmentDirectory {
    
    private ArrayList<FederalGovernment> federalGovernmentDirectory;
    
    public FederalGovernmentDirectory(){
    federalGovernmentDirectory = new ArrayList();
    }

    public ArrayList<FederalGovernment> getFederalGovernmentDirectory() {
        return federalGovernmentDirectory;
    }

    public void setFederalGovernmentDirectory(ArrayList<FederalGovernment> federalGovernmentDirectory) {
        this.federalGovernmentDirectory = federalGovernmentDirectory;
    }

    public FederalGovernment getFederalGovernment(String name){
    for(FederalGovernment fg: federalGovernmentDirectory){
        if(fg.getFedName().equalsIgnoreCase(name)){
            return fg;
            }
        }
        return null;
    }
    
    public FederalGovernment addNewFedGovernment(String fedName, String fedRAddress, double currentStock){
    FederalGovernment fg = new FederalGovernment(fedName, fedRAddress, currentStock);
    federalGovernmentDirectory.add(fg);
    return fg;
}
    public void removeFedGovernment(FederalGovernment fg){
   federalGovernmentDirectory.remove(fg);
}
}
