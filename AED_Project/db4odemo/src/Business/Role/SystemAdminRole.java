/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
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
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class SystemAdminRole extends Role{

  
<<<<<<< HEAD
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem system, VaccineManufacturerDirectory vaccineManufacturerDirectory, FederalGovernmentDirectory federalGovernmentDirectory, StateGovernmentDirectory stateGovernmentDirectory, ColdChainSupplierDirectory coldChainSupplierDirectory, VaccinationCenterDirectory vaccinationCenterDirectory, SessionManagerDirectory sessionManagerDirectory) {
        return new SystemAdminWorkAreaJPanel(userProcessContainer, system, account, vaccineManufacturerDirectory, federalGovernmentDirectory, stateGovernmentDirectory, coldChainSupplierDirectory, vaccinationCenterDirectory, sessionManagerDirectory);
=======
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem system, VaccineManufacturerDirectory vaccineManufacturerDirectory, FederalGovernmentDirectory federalGovernmentDirectory, StateGovernmentDirectory stateGovernmentDirectory, ColdChainSupplierDirectory coldChainSupplierDirectory, VaccinationCenterDirectory vaccinationCenterDirectory, SessionManagerDirectory sessionManagerDirectory,  AEFIManagerDirectory aefiManagerDirectory, VaccinatorDirectory vaccinatorDirectory) {
        return new SystemAdminWorkAreaJPanel(userProcessContainer, system, account, vaccineManufacturerDirectory, federalGovernmentDirectory, stateGovernmentDirectory, coldChainSupplierDirectory, vaccinationCenterDirectory, sessionManagerDirectory, aefiManagerDirectory, vaccinatorDirectory);
>>>>>>> f47622f38f2de8838de1e1ba799c6c150eb975b5
    }
    
}
