/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.VaccineRequestFTVM;

import java.util.ArrayList;

/**
 *
 * @author Karan
 */
public class VaccineRequestFTVMDirectory {
    
    private ArrayList<VaccineRequestFTVM> requestFTVMDirectory;
     
    public VaccineRequestFTVMDirectory(){
        requestFTVMDirectory = new ArrayList();
    }

    public ArrayList<VaccineRequestFTVM> getRequestFTVMDirectory() {
        return requestFTVMDirectory;
    }

    public void setRequestFTVMDirectory(ArrayList<VaccineRequestFTVM> requestFTVMDirectory) {
        this.requestFTVMDirectory = requestFTVMDirectory;
    }
    
    public VaccineRequestFTVM newVaccineRequest(){
        VaccineRequestFTVM vaccineRequestFTVM = new VaccineRequestFTVM();
        requestFTVMDirectory.add(vaccineRequestFTVM);
        return vaccineRequestFTVM;
    }
    
    public VaccineRequestFTVM getRequestID(String id){
        for(VaccineRequestFTVM vaccineRequestFTVM:requestFTVMDirectory){
            if(vaccineRequestFTVM.getVaccineRequestID().equals(id)){
                return vaccineRequestFTVM;
            }
        }
        return null;
    }
}
