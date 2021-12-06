/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.VaccinationCenter;

import java.util.ArrayList;

/**
 *
 * @author Karan
 */
public class VaccinationCenterDirectory {
    
    private ArrayList<VaccinationCenter> vaccinationCenterDirectory;
    
    public VaccinationCenterDirectory(){
        vaccinationCenterDirectory = new ArrayList();
    }

    public ArrayList<VaccinationCenter> getVaccinationCenterDirectory() {
        return vaccinationCenterDirectory;
    }

    public void setVaccinationCenterDirectory(ArrayList<VaccinationCenter> vaccinationCenterDirectory) {
        this.vaccinationCenterDirectory = vaccinationCenterDirectory;
    }
    
    public VaccinationCenter getVaccinationCenter(String name){
        for (VaccinationCenter vc: vaccinationCenterDirectory){
            if(vc.getCenterName().equalsIgnoreCase(name)){
                return vc;
            }
        }
        return null;
    }
    
    public VaccinationCenter addNewVaccinationCenter(String centerName, String centerAddress, String centerZipCode, String centerContact, double centerBalanceDoses, String stateGovName){
        VaccinationCenter vc = new VaccinationCenter(centerName, centerAddress, centerZipCode, centerContact, centerBalanceDoses, stateGovName);
        vaccinationCenterDirectory.add(vc);
        return vc;
    } 
    
    public void removeVaccinationCenter(VaccinationCenter vc){
        vaccinationCenterDirectory.remove(vc);
    }
}
