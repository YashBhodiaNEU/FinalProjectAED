/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.VaccineRequestVCTS;

import Business.StateGovernment.StateGovernment;
import Business.VaccinationCenter.VaccinationCenter;
import Business.WorkQueue.WorkRequest;

/**
 *
 * @author Karan
 */
public class VaccineRequestVCTS extends WorkRequest{
    private String vaccineRequestID;
    private String stateGovernment;
    private String vaccinationCenter;
    private String vaccineManufacturer;
    private String coldChainSupplier;
    private String vaccineRequestStatus;
    private int numberOfDoses;

    public String getVaccineRequestID() {
        return vaccineRequestID;
    }

    public void setVaccineRequestID(String vaccineRequestID) {
        this.vaccineRequestID = vaccineRequestID;
    }

    public String getStateGovernment() {
        return stateGovernment;
    }

    public void setStateGovernment(String stateGovernment) {
        this.stateGovernment = stateGovernment;
    }

    public String getVaccinationCenter() {
        return vaccinationCenter;
    }

    public void setVaccinationCenter(String vaccinationCenter) {
        this.vaccinationCenter = vaccinationCenter;
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
