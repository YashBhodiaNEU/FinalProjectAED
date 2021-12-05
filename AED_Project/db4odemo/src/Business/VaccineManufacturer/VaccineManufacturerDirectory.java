/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.VaccineManufacturer;

import java.util.ArrayList;

/**
 *
 * @author Karan
 */
public class VaccineManufacturerDirectory {
    
    private ArrayList<VaccineManufacturer> vaccineManufacturerDirectory;
    
    public VaccineManufacturerDirectory(){
        vaccineManufacturerDirectory = new ArrayList();
    }

    public ArrayList<VaccineManufacturer> getVaccineManufacturerDirectory() {
        return vaccineManufacturerDirectory;
    }

    public void setVaccineManufacturerDirectory(ArrayList<VaccineManufacturer> vaccineManufacturerDirectory) {
        this.vaccineManufacturerDirectory = vaccineManufacturerDirectory;
    }
    
    public VaccineManufacturer getVaccineManufacturer(String name){
    for(VaccineManufacturer vaccineManufacturer: vaccineManufacturerDirectory){
        if(vaccineManufacturer.getManufacturerName().equalsIgnoreCase(name)){
            return vaccineManufacturer;
            }
        }
        return null;
    }
    
    public VaccineManufacturer addNewVaccineManufacturer(String manufacturerName, String vaccineName, double currentStock){
        VaccineManufacturer vaccineManufacturer = new VaccineManufacturer(manufacturerName, vaccineName, currentStock);
        vaccineManufacturerDirectory.add(vaccineManufacturer);
        return vaccineManufacturer;
    }
    
     public void removeManufacturer(VaccineManufacturer vaccineManufacturer){
        vaccineManufacturerDirectory.remove(vaccineManufacturer);
    }
}
