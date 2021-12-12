/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.VaccineRequestSTF;

import java.util.ArrayList;

/**
 *
 * @author Karan
 */
public class VaccineRequestSTFDirectory {
    
    private ArrayList<VaccineRequestSTF> requestSTFDirectory;
    
    public VaccineRequestSTFDirectory(){
        requestSTFDirectory = new ArrayList();
    }

    public ArrayList<VaccineRequestSTF> getRequestSTFDirectory() {
        return requestSTFDirectory;
    }

    public void setRequestSTFDirectory(ArrayList<VaccineRequestSTF> requestSTFDirectory) {
        this.requestSTFDirectory = requestSTFDirectory;
    }
    
    public VaccineRequestSTF newVaccineRequest(){
        VaccineRequestSTF vaccineRequestSTF = new VaccineRequestSTF();
        requestSTFDirectory.add(vaccineRequestSTF);
        return vaccineRequestSTF;
    }
    
    public VaccineRequestSTF getRequestID(String id){
        for(VaccineRequestSTF vaccineRequestSTF:requestSTFDirectory){
            if(vaccineRequestSTF.getVaccineRequestID().equals(id)){
                return vaccineRequestSTF;
            }
        }
        return null;
    }
}
