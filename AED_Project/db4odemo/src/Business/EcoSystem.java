/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.FederalGovernment.FederalGovernmentDirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.VaccineManufacturer.VaccineManufacturerDirectory;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    private VaccineManufacturerDirectory vaccineManufacturerDirectory;
    private FederalGovernmentDirectory federalGovernmentDirectory;

    public EcoSystem(VaccineManufacturerDirectory vaccineManufacturerDirectory, FederalGovernmentDirectory federalGovernmentDirectory) {
        this.vaccineManufacturerDirectory = vaccineManufacturerDirectory;
        this.federalGovernmentDirectory = federalGovernmentDirectory;
    }
    
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }

    public VaccineManufacturerDirectory getVaccineManufacturerDirectory() {
        return vaccineManufacturerDirectory;
    }

    public void setVaccineManufacturerDirectory(VaccineManufacturerDirectory vaccineManufacturerDirectory) {
        this.vaccineManufacturerDirectory = vaccineManufacturerDirectory;
    }

    public static EcoSystem getBusiness() {
        return business;
    }

    public static void setBusiness(EcoSystem business) {
        EcoSystem.business = business;
    }

    public FederalGovernmentDirectory getFederalGovernmentDirectory() {
        if (federalGovernmentDirectory == null){
            federalGovernmentDirectory = new FederalGovernmentDirectory();
        }
        return federalGovernmentDirectory;
    }

    public void setFederalGovernmentDirectory(FederalGovernmentDirectory federalGovernmentDirectory) {
        this.federalGovernmentDirectory = federalGovernmentDirectory;
    }
    
   
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    
    private EcoSystem(){
        super(null);
       // networkList=new ArrayList<Network>();
       vaccineManufacturerDirectory = new VaccineManufacturerDirectory();
       federalGovernmentDirectory = new FederalGovernmentDirectory();
    }

    
    public boolean checkIfUserIsUnique(String userName){
       //
       return false;
    }
}
