/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.ColdChainSupplier.ColdChainSupplierDirectory;
import Business.EcoSystem;
import Business.FederalGovernment.FederalGovernmentDirectory;
import Business.StateGovernment.StateGovernmentDirectory;

import Business.UserAccount.UserAccount;
import Business.VaccinationCenter.VaccinationCenterDirectory;
import Business.VaccineManufacturer.VaccineManufacturerDirectory;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class SystemAdminRole extends Role{

  
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem system, VaccineManufacturerDirectory vaccineManufacturerDirectory, FederalGovernmentDirectory federalGovernmentDirectory, StateGovernmentDirectory stateGovernmentDirectory, ColdChainSupplierDirectory coldChainSupplierDirectory, VaccinationCenterDirectory vaccinationCenterDirectory) {
        return new SystemAdminWorkAreaJPanel(userProcessContainer, system, account, vaccineManufacturerDirectory, federalGovernmentDirectory, stateGovernmentDirectory, coldChainSupplierDirectory, vaccinationCenterDirectory);
    }
    
}
