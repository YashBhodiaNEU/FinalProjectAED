/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.VaccineRequestSTF;

import Business.WorkQueue.WorkRequest;

/**
 *
 * @author Karan
 */
public class VaccineRequestSTF extends WorkRequest{
    private String vaccineRequestID;
    private String fedName;
    private String stateGovernment;
    private String vaccineManufacturer;
    private String coldChainSupplier;
    private String vaccineRequestStatus;
    private int numberOfDoses;

    public String getFedName() {
        return fedName;
    }

    public void setFedName(String fedName) {
        this.fedName = fedName;
    }

    public String getVaccineRequestID() {
        return vaccineRequestID;
    }

    public void setVaccineRequestID(String vaccineRequestID) {
        this.vaccineRequestID = vaccineRequestID;
    }

    public String getVaccineManufacturer() {
        return vaccineManufacturer;
    }

    public void setVaccineManufacturer(String vaccineManufacturer) {
        this.vaccineManufacturer = vaccineManufacturer;
    }
    
    public String getStateGovernment() {
        return stateGovernment;
    }

    public void setStateGovernment(String stateGovernment) {
        this.stateGovernment = stateGovernment;
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
