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
import userinterface.FederalGovernment.FederalGovernmentWorkArea;
import userinterface.StateGovernment.StateGovernmentWorkArea;

/**
 *
 * @author Karan
 */
public class StateGovernmentRole extends Role {
    
    @Override
<<<<<<< HEAD
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem ecosystem, VaccineManufacturerDirectory vaccineManufacturerDirectory, FederalGovernmentDirectory federalGovernmentDirectory, StateGovernmentDirectory stateGovernmentDirectory, ColdChainSupplierDirectory coldChainSupplierDirectory, VaccinationCenterDirectory vaccinationCenterDirectory, SessionManagerDirectory sessionManagerDirectory){
        return new StateGovernmentWorkArea(userProcessContainer, account, ecosystem, federalGovernmentDirectory, vaccineManufacturerDirectory, stateGovernmentDirectory, coldChainSupplierDirectory, vaccinationCenterDirectory, sessionManagerDirectory);
=======
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem ecosystem, VaccineManufacturerDirectory vaccineManufacturerDirectory, FederalGovernmentDirectory federalGovernmentDirectory, StateGovernmentDirectory stateGovernmentDirectory, ColdChainSupplierDirectory coldChainSupplierDirectory, VaccinationCenterDirectory vaccinationCenterDirectory, SessionManagerDirectory sessionManagerDirectory,  AEFIManagerDirectory aefiManagerDirectory, VaccinatorDirectory vaccinatorDirectory){
        return new StateGovernmentWorkArea(userProcessContainer, account, ecosystem, federalGovernmentDirectory, vaccineManufacturerDirectory, stateGovernmentDirectory, coldChainSupplierDirectory, vaccinationCenterDirectory, sessionManagerDirectory, aefiManagerDirectory,vaccinatorDirectory);
>>>>>>> f47622f38f2de8838de1e1ba799c6c150eb975b5
    }      
}
