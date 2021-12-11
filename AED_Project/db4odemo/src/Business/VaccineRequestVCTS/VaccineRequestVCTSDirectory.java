/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.VaccineRequestVCTS;

import java.util.ArrayList;

/**
 *
 * @author Karan
 */
public class VaccineRequestVCTSDirectory {
    
    private ArrayList<VaccineRequestVCTS> requestVCTSDirectory;
    
    public VaccineRequestVCTSDirectory(){
        requestVCTSDirectory = new ArrayList();
    }

    public ArrayList<VaccineRequestVCTS> getRequestVCTSDirectory() {
        return requestVCTSDirectory;
    }

    public void setRequestVCTSDirectory(ArrayList<VaccineRequestVCTS> requestVCTSDirectory) {
        this.requestVCTSDirectory = requestVCTSDirectory;
    }
    
    public VaccineRequestVCTS newVaccineRequest(){
        VaccineRequestVCTS vaccineRequestVCTS = new VaccineRequestVCTS();
        requestVCTSDirectory.add(vaccineRequestVCTS);
        return vaccineRequestVCTS;
    }
    
    public VaccineRequestVCTS getRequestID(String id){
        for(VaccineRequestVCTS vaccineRequestVCTS:requestVCTSDirectory){
            if(vaccineRequestVCTS.getVaccineRequestID().equals(id)){
                return vaccineRequestVCTS;
            }
        }
        return null;
    }
    
}
