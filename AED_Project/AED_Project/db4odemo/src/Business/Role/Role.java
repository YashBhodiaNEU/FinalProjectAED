/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.AEFIManager.AEFIManagerDirectory;
import Business.Beneficiary.BeneficiaryDirectory;
import Business.ColdChainSupplier.ColdChainSupplierDirectory;
import Business.EcoSystem;
import Business.FederalGovernment.FederalGovernmentDirectory;

import Business.Organization;
import Business.SessionManagers.SessionManagerDirectory;
import Business.StateGovernment.StateGovernmentDirectory;
import Business.UserAccount.UserAccount;
import Business.VaccinationCenter.VaccinationCenterDirectory;
import Business.VaccinationSession.VaccinationSessionDirectory;
import Business.Vaccinator.VaccinatorDirectory;
import Business.VaccineManufacturer.VaccineManufacturerDirectory;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public abstract class Role {
    
    public enum RoleType{
        SysAdmin("SystemAdmin"),
        VaccineManufacturer("VaccineManufacturer"),
        FederalGovernment("FederalGovernment"),
        StateGovernment("StateGovernment"),
        ColdChainAdmin("ColdChainAdmin"),
        VaccinationCenterHead("VaccinationCenterHead"),
        VaccinationSessionManager("VaccinationSessionManager"),
        AEFIManager("AEFIManager"),
        Emergency("Emergency"),
        Vaccinator("Vaccinator"),
        Benefiaciary("Beneficiary"),
        RawMaterialSupplier("RawMaterialSupplier");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account,  
            EcoSystem business,
            VaccineManufacturerDirectory vaccineManufacturerDirectory,
            FederalGovernmentDirectory federalGovernmentDirectory,
            StateGovernmentDirectory stateGovernmentDirectory,
            ColdChainSupplierDirectory coldChainSupplierDirectoy,
            VaccinationCenterDirectory vaccinationCenterDirectory,
            SessionManagerDirectory sessionManagerDirectory,
            AEFIManagerDirectory aefiManagerDirectory,
            VaccinatorDirectory vaccinatorDirectory,
            VaccinationSessionDirectory vaccinationSessionDirectory,
            BeneficiaryDirectory beneficiaryDirectory);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}