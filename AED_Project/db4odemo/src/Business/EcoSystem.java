/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import Business.AEFIManager.AEFIManagerDirectory;
import Business.AppointmentBooking.AppointmentDirectory;
import Business.Beneficiary.BeneficiaryDirectory;
import Business.ColdChainSupplier.ColdChainSupplierDirectory;
import Business.FederalGovernment.FederalGovernmentDirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.SessionManagers.SessionManagerDirectory;
import Business.StateGovernment.StateGovernmentDirectory;
import Business.VaccinationCenter.VaccinationCenterDirectory;
import Business.VaccinationSession.VaccinationSessionDirectory;
import Business.Vaccinator.VaccinatorDirectory;
import Business.VaccineManufacturer.VaccineManufacturerDirectory;
import Business.VaccineRequestFTVM.VaccineRequestFTVMDirectory;
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
    private AEFIManagerDirectory aefiManagerDirectory;
    private VaccinatorDirectory vaccinatorDirectory;
    private VaccinationSessionDirectory vaccineSessionDirectory;
    private BeneficiaryDirectory beneficiaryDirectory;
    private AppointmentDirectory appointmentDirectory;
    private VaccineRequestFTVMDirectory requestFTVMDirectory;
    
    public EcoSystem(VaccineManufacturerDirectory vaccineManufacturerDirectory, FederalGovernmentDirectory federalGovernmentDirectory, StateGovernmentDirectory stateGovernmentDirectory, ColdChainSupplierDirectory coldChainSupplierDirectory, VaccinationCenterDirectory vaccinationCenterDirectory, SessionManagerDirectory sessionManagerDirectory, AEFIManagerDirectory aefiManagerDirectory, VaccinatorDirectory vaccinatorDirectory, VaccinationSessionDirectory vaccineSessionDirectory, BeneficiaryDirectory beneficiaryDirectory, AppointmentDirectory appointmentDirectory, VaccineRequestFTVMDirectory requestFTVMDirectory) {
        this.vaccineManufacturerDirectory = vaccineManufacturerDirectory;
        this.federalGovernmentDirectory = federalGovernmentDirectory;
        this.stateGovernmentDirectory = stateGovernmentDirectory;
        this.coldChainSupplierDirectory = coldChainSupplierDirectory;
        this.vaccinationCenterDirectory = vaccinationCenterDirectory;
        this.sessionManagerDirectory = sessionManagerDirectory;
        this.aefiManagerDirectory = aefiManagerDirectory;
        this.vaccinatorDirectory = vaccinatorDirectory;
        this.vaccineSessionDirectory = vaccineSessionDirectory;
        this.beneficiaryDirectory = beneficiaryDirectory;
        this.appointmentDirectory = appointmentDirectory;
        this.requestFTVMDirectory = requestFTVMDirectory;
    }

    public VaccineRequestFTVMDirectory getRequestFTVMDirectory() {
        if(requestFTVMDirectory == null){
            this.requestFTVMDirectory = new VaccineRequestFTVMDirectory();
        }
        return requestFTVMDirectory;
    }

    public void setRequestFTVMDirectory(VaccineRequestFTVMDirectory requestFTVMDirectory) {
        this.requestFTVMDirectory = requestFTVMDirectory;
    }

    
    
    public AppointmentDirectory getAppointmentDirectory() {
        
        if(appointmentDirectory == null){
            this.appointmentDirectory = new AppointmentDirectory();
        }
        return appointmentDirectory;
    }

    public void setAppointmentDirectory(AppointmentDirectory appointmentDirectory) {
        this.appointmentDirectory = appointmentDirectory;
    }

    
    
    public BeneficiaryDirectory getBeneficiaryDirectory() {
        if(beneficiaryDirectory == null){
            this.beneficiaryDirectory = new BeneficiaryDirectory();
        }
        return beneficiaryDirectory;
    }

    public void setBeneficiaryDirectory(BeneficiaryDirectory beneficiaryDirectory) {
        this.beneficiaryDirectory = beneficiaryDirectory;
    }
    
    public VaccinationSessionDirectory getVaccineSessionDirectory() {
        if(vaccineSessionDirectory == null){
            this.vaccineSessionDirectory = new VaccinationSessionDirectory();
        }
        return vaccineSessionDirectory;
    }

    public void setVaccineSessionDirectory(VaccinationSessionDirectory vaccineSessionDirectory) {
        this.vaccineSessionDirectory = vaccineSessionDirectory;
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
       aefiManagerDirectory = new AEFIManagerDirectory();
       vaccinatorDirectory = new VaccinatorDirectory();
       beneficiaryDirectory = new BeneficiaryDirectory();
       appointmentDirectory = new AppointmentDirectory();
       requestFTVMDirectory = new VaccineRequestFTVMDirectory();
    }

    
    public boolean checkIfUserIsUnique(String userName){
       //
       return false;
    }
}
