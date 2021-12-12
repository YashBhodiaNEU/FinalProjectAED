/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Vaccinator;

import Business.AEFIManager.AEFIManager;
import java.util.ArrayList;

/**
 *
 * @author Karan
 */
public class VaccinatorDirectory {
    
    private ArrayList<Vaccinator> vaccinatorDirectory;
    
    public VaccinatorDirectory(){
        vaccinatorDirectory = new ArrayList();
    }

    public ArrayList<Vaccinator> getVaccinatorDirectory() {
        return vaccinatorDirectory;
    }

    public void setVaccinatorDirectory(ArrayList<Vaccinator> vaccinatorDirectory) {
        this.vaccinatorDirectory = vaccinatorDirectory;
    }
    
    public Vaccinator getVaccinator(String name){
        for (Vaccinator sm: vaccinatorDirectory){
            if(sm.getVaccinatorName().equalsIgnoreCase(name)){
                return sm;
            }
        }
        return null;
    }
    
    public Vaccinator addVaccinator(String managerName, String managerEmailId, String centerName){
        Vaccinator sm = new Vaccinator(managerName, managerEmailId, centerName);
        vaccinatorDirectory.add(sm);
        return sm;
    }
    
    public void removeVaccinator(Vaccinator sm){
        vaccinatorDirectory.remove(sm);
    }
}
