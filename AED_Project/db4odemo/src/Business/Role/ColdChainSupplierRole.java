/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

<<<<<<< HEAD
=======
import Business.AEFIManager.AEFIManagerDirectory;
>>>>>>> f47622f38f2de8838de1e1ba799c6c150eb975b5
import Business.ColdChainSupplier.ColdChainSupplierDirectory;
import Business.EcoSystem;
import Business.FederalGovernment.FederalGovernmentDirectory;
import Business.SessionManagers.SessionManagerDirectory;
import Business.StateGovernment.StateGovernmentDirectory;
import Business.UserAccount.UserAccount;
import Business.VaccinationCenter.VaccinationCenterDirectory;
<<<<<<< HEAD
=======
import Business.Vaccinator.VaccinatorDirectory;
>>>>>>> f47622f38f2de8838de1e1ba799c6c150eb975b5
import Business.VaccineManufacturer.VaccineManufacturerDirectory;
import javax.swing.JPanel;
import userinterface.ColdChainSupplier.ColdChainSupplierWorkArea;
import userinterface.FederalGovernment.FederalGovernmentWorkArea;

/**
 *
 * @author Karan
 */
public class ColdChainSupplierRole extends Role {
    @Override
<<<<<<< HEAD
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem ecosystem, VaccineManufacturerDirectory vaccineManufacturerDirectory, FederalGovernmentDirectory federalGovernmentDirectory, StateGovernmentDirectory stateGovernmentDirectory, ColdChainSupplierDirectory coldChainSupplierDirectory, VaccinationCenterDirectory vaccinationCenterDirectory, SessionManagerDirectory sessionManagerDirectory){
        return new ColdChainSupplierWorkArea(userProcessContainer, account, ecosystem, federalGovernmentDirectory, vaccineManufacturerDirectory, stateGovernmentDirectory, coldChainSupplierDirectory, vaccinationCenterDirectory, sessionManagerDirectory);
=======
    public JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            EcoSystem ecosystem, 
            VaccineManufacturerDirectory vaccineManufacturerDirectory, 
            FederalGovernmentDirectory federalGovernmentDirectory, 
            StateGovernmentDirectory stateGovernmentDirectory, 
            ColdChainSupplierDirectory coldChainSupplierDirectory, 
            VaccinationCenterDirectory vaccinationCenterDirectory, 
            SessionManagerDirectory sessionManagerDirectory, 
            AEFIManagerDirectory aefiManagerDirectory,
            VaccinatorDirectory vaccinatorDirectory){
        return new ColdChainSupplierWorkArea(userProcessContainer, account, ecosystem, vaccineManufacturerDirectory, federalGovernmentDirectory, stateGovernmentDirectory, coldChainSupplierDirectory, vaccinationCenterDirectory, sessionManagerDirectory, aefiManagerDirectory, vaccinatorDirectory);
>>>>>>> f47622f38f2de8838de1e1ba799c6c150eb975b5
    }
}
