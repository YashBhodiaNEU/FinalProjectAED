/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
<<<<<<< HEAD
=======
import Business.AEFIManager.AEFIManagerDirectory;
>>>>>>> f47622f38f2de8838de1e1ba799c6c150eb975b5
import Business.ColdChainSupplier.ColdChainSupplierDirectory;
import Business.FederalGovernment.FederalGovernmentDirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.SessionManagers.SessionManagerDirectory;
import Business.StateGovernment.StateGovernmentDirectory;
import Business.VaccinationCenter.VaccinationCenterDirectory;
<<<<<<< HEAD
=======
import Business.Vaccinator.VaccinatorDirectory;
>>>>>>> f47622f38f2de8838de1e1ba799c6c150eb975b5
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
    private SessionManagerDirectory sessionManagerDirectory;
<<<<<<< HEAD

    public EcoSystem(VaccineManufacturerDirectory vaccineManufacturerDirectory, FederalGovernmentDirectory federalGovernmentDirectory, StateGovernmentDirectory stateGovernmentDirectory, ColdChainSupplierDirectory coldChainSupplierDirectory, VaccinationCenterDirectory vaccinationCenterDirectory, SessionManagerDirectory sessionManagerDirectory) {
=======
    private AEFIManagerDirectory aefiManagerDirectory;
    private VaccinatorDirectory vaccinatorDirectory;

    public EcoSystem(VaccineManufacturerDirectory vaccineManufacturerDirectory, FederalGovernmentDirectory federalGovernmentDirectory, StateGovernmentDirectory stateGovernmentDirectory, ColdChainSupplierDirectory coldChainSupplierDirectory, VaccinationCenterDirectory vaccinationCenterDirectory, SessionManagerDirectory sessionManagerDirectory, AEFIManagerDirectory aefiManagerDirectory, VaccinatorDirectory vaccinatorDirectory) {
>>>>>>> f47622f38f2de8838de1e1ba799c6c150eb975b5
        this.vaccineManufacturerDirectory = vaccineManufacturerDirectory;
        this.federalGovernmentDirectory = federalGovernmentDirectory;
        this.stateGovernmentDirectory = stateGovernmentDirectory;
        this.coldChainSupplierDirectory = coldChainSupplierDirectory;
        this.vaccinationCenterDirectory = vaccinationCenterDirectory;
        this.sessionManagerDirectory = sessionManagerDirectory;
<<<<<<< HEAD
    }

=======
        this.aefiManagerDirectory = aefiManagerDirectory;
        this.vaccinatorDirectory = vaccinatorDirectory;
    }

    public VaccinatorDirectory getVaccinatorDirectory() {
        if(vaccinatorDirectory == null){
            vaccinatorDirectory = new VaccinatorDirectory();
        }
        return vaccinatorDirectory;
    }

    public void setVaccinatorDirectory(VaccinatorDirectory vaccinatorDirectory) {
        this.vaccinatorDirectory = vaccinatorDirectory;
    }

    public AEFIManagerDirectory getAefiManagerDirectory() {
        if(aefiManagerDirectory == null){
            aefiManagerDirectory = new AEFIManagerDirectory();
        }
        return aefiManagerDirectory;
    }

    public void setAefiManagerDirectory(AEFIManagerDirectory aefiManagerDirectory) {
        this.aefiManagerDirectory = aefiManagerDirectory;
    }
    
>>>>>>> f47622f38f2de8838de1e1ba799c6c150eb975b5
    public SessionManagerDirectory getSessionManagerDirectory() {
        if(sessionManagerDirectory == null){
            sessionManagerDirectory = new SessionManagerDirectory();
        }
        return sessionManagerDirectory;
    }

    public void setSessionManagerDirectory(SessionManagerDirectory sessionManagerDirectory) {
        this.sessionManagerDirectory = sessionManagerDirectory;
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
       sessionManagerDirectory = new SessionManagerDirectory();
<<<<<<< HEAD
=======
       aefiManagerDirectory = new AEFIManagerDirectory();
       vaccinatorDirectory = new VaccinatorDirectory();
>>>>>>> f47622f38f2de8838de1e1ba799c6c150eb975b5
    }

    
    public boolean checkIfUserIsUnique(String userName){
       //
       return false;
    }
}
