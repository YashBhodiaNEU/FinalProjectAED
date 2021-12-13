/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.VaccineRequestFTVM;

import Business.ColdChainSupplier.ColdChainSupplier;
import Business.FederalGovernment.FederalGovernment;
import Business.VaccineManufacturer.VaccineManufacturer;
import Business.WorkQueue.WorkRequest;

/**
 *
 * @author Karan
 */
public class VaccineRequestFTVM extends WorkRequest{
    private String vaccineRequestID;
    private String federalGovernment;
    private String vaccineManufacturer;
    private String coldChainSupplier;
    private String vaccineRequestStatus;
    private int numberOfDoses;

    public String getFederalGovernment() {
        return federalGovernment;
    }

    public void setFederalGovernment(String federalGovernment) {
        this.federalGovernment = federalGovernment;
    }

    public String getVaccineManufacturer() {
        return vaccineManufacturer;
    }

    public void setVaccineManufacturer(String vaccineManufacturer) {
        this.vaccineManufacturer = vaccineManufacturer;
    }

    public String getColdChainSupplier() {
        return coldChainSupplier;
    }

    public void setColdChainSupplier(String coldChainSupplier) {
        this.coldChainSupplier = coldChainSupplier;
    }

    public String getVaccineRequestID() {
        return vaccineRequestID;
    }

    public void setVaccineRequestID(String vaccineRequestID) {
        this.vaccineRequestID = vaccineRequestID;
    }

    public String getVaccineRequestStatus() {
        return vaccineRequestStatus;
    }

    public void setVaccineRequestStatus(String vaccineRequestStatus) {
        this.vaccineRequestStatus = vaccineRequestStatus;
    }

    public int getNumberOfDoses() {
        return numberOfDoses;
    }

    public void setNumberOfDoses(int numberOfDoses) {
        this.numberOfDoses = numberOfDoses;
    }
    
    @Override
    public String toString(){
        return vaccineRequestID;
    }
}
