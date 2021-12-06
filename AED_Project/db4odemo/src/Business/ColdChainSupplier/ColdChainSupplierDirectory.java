/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.ColdChainSupplier;

import Business.FederalGovernment.FederalGovernment;
import java.util.ArrayList;

/**
 *
 * @author Karan
 */
public class ColdChainSupplierDirectory {
    
    private ArrayList<ColdChainSupplier> coldChainSupplierDirectory;
    
    public ColdChainSupplierDirectory(){
        coldChainSupplierDirectory = new ArrayList();
    }

    public ArrayList<ColdChainSupplier> getColdChainSupplierDirectory() {
        return coldChainSupplierDirectory;
    }

    public void setColdChainSupplierDirectory(ArrayList<ColdChainSupplier> coldChainSupplierDirectory) {
        this.coldChainSupplierDirectory = coldChainSupplierDirectory;
    }
    
    public ColdChainSupplier getColdChainSupplier(String name){
        for (ColdChainSupplier ccs: coldChainSupplierDirectory){
            if(ccs.getColdChainSupplierName().equalsIgnoreCase(name)){
                return ccs;
            }
        }
        return null;
    }
    
    public ColdChainSupplier addColdChain(String name, float minTemp){
        ColdChainSupplier ccs = new ColdChainSupplier(name, minTemp);
        coldChainSupplierDirectory.add(ccs);
        return ccs;
    }
    
    public void removeColdChainSupplier(ColdChainSupplier ccs){
        coldChainSupplierDirectory.remove(ccs);
    }
    
}
