/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import Business.ColdChainSupplier.ColdChainSupplierDirectory;
import Business.FederalGovernment.FederalGovernmentDirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.StateGovernment.StateGovernmentDirectory;
import Business.VaccinationCenter.VaccinationCenterDirectory;
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
    private StateGovernmentDirectory stateGovernmentDirectory;
    private ColdChainSupplierDirectory coldChainSupplierDirectory;
    private VaccinationCenterDirectory vaccinationCenterDirectory;

    public EcoSystem(VaccineManufacturerDirectory vaccineManufacturerDirectory, FederalGovernmentDirectory federalGovernmentDirectory, StateGovernmentDirectory stateGovernmentDirectory, ColdChainSupplierDirectory coldChainSupplierDirectory, VaccinationCenterDirectory vaccinationCenterDirectory) {
        this.vaccineManufacturerDirectory = vaccineManufacturerDirectory;
        this.federalGovernmentDirectory = federalGovernmentDirectory;
        this.stateGovernmentDirectory = stateGovernmentDirectory;
        this.coldChainSupplierDirectory = coldChainSupplierDirectory;
        this.vaccinationCenterDirectory = vaccinationCenterDirectory;
    }

    public VaccinationCenterDirectory getVaccinationCenterDirectory() {
        if(vaccinationCenterDirectory == null){
           vaccinationCenterDirectory = new  VaccinationCenterDirectory();                      
        }
        return vaccinationCenterDirectory;
    }

    public void setVaccinationCenterDirectory(VaccinationCenterDirectory vaccinationCenterDirectory) {
        this.vaccinationCenterDirectory = vaccinationCenterDirectory;
    }

    
    
    public ColdChainSupplierDirectory getColdChainSupplierDirectory() {
        if(coldChainSupplierDirectory == null){
            coldChainSupplierDirectory = new ColdChainSupplierDirectory();
        }
        return coldChainSupplierDirectory;
    }

    public void setColdChainSupplierDirectory(ColdChainSupplierDirectory coldChainSupplierDirectory) {
        this.coldChainSupplierDirectory = coldChainSupplierDirectory;
    }
   
    public StateGovernmentDirectory getStateGovernmentDirectory() {
        if (stateGovernmentDirectory == null){
            stateGovernmentDirectory = new StateGovernmentDirectory();
        }
        return stateGovernmentDirectory;
    }

    public void setStateGovernmentDirectory(StateGovernmentDirectory stateGovernmentDirectory) {
        this.stateGovernmentDirectory = stateGovernmentDirectory;
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
       stateGovernmentDirectory = new StateGovernmentDirectory();
       coldChainSupplierDirectory = new ColdChainSupplierDirectory();
       vaccinationCenterDirectory = new VaccinationCenterDirectory();
    }

    
    public boolean checkIfUserIsUnique(String userName){
       //
       return false;
    }
}
