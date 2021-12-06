/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;
import Business.AEFIManager.AEFIManagerDirectory;
import Business.ColdChainSupplier.ColdChainSupplierDirectory;
import Business.EcoSystem;
import Business.FederalGovernment.FederalGovernmentDirectory;
import Business.SessionManagers.SessionManagerDirectory;
import Business.StateGovernment.StateGovernmentDirectory;
import Business.UserAccount.UserAccount;
import Business.VaccinationCenter.VaccinationCenterDirectory;
import Business.VaccineManufacturer.VaccineManufacturerDirectory;
import javax.swing.JPanel;
import userinterface.VaccineManufacturer.ManufacturerWorkArea;

/**
 *
 * @author Karan
 */
public class VaccineManufacturerRole extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem ecosystem, VaccineManufacturerDirectory vaccineManufacturerDirectory, FederalGovernmentDirectory federalGovernmentDirectory, StateGovernmentDirectory stateGovernmentDirectory, ColdChainSupplierDirectory coldChainSupplierDirectory, VaccinationCenterDirectory vaccinationCenterDirectory, SessionManagerDirectory sessionManagerDirectory, AEFIManagerDirectory aefiManagerDirectory){
        return new ManufacturerWorkArea(userProcessContainer, account, ecosystem, vaccineManufacturerDirectory, federalGovernmentDirectory, stateGovernmentDirectory, coldChainSupplierDirectory, vaccinationCenterDirectory, sessionManagerDirectory, aefiManagerDirectory);
    }
    
}
