/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.AppointmentBooking;

import Business.Beneficiary.Beneficiary;
import Business.VaccinationSession.VaccinationSession;
import Business.WorkQueue.WorkRequest;

/**
 *
 * @author Karan
 */
public class BookAppointment extends WorkRequest {
    
    private String appointmentID;
    private String appointmentStatus;
    private VaccinationSession vaccinationSession;
    private Beneficiary beneficiary;
    private int doseNumber;

    public String getAppointmentStatus() {
        return appointmentStatus;
    }

    public void setAppointmentStatus(String appointmentStatus) {
        this.appointmentStatus = appointmentStatus;
    }

    public VaccinationSession getVaccinationSession() {
        return vaccinationSession;
    }

    public void setVaccinationSession(VaccinationSession vaccinationSession) {
        this.vaccinationSession = vaccinationSession;
    }

    public Beneficiary getBeneficiary() {
        return beneficiary;
    }

    public void setBeneficiary(Beneficiary beneficiary) {
        this.beneficiary = beneficiary;
    }

    public int getDoseNumber() {
        return doseNumber;
    }

    public void setDoseNumber(int doseNumber) {
        this.doseNumber = doseNumber;
    }

    public String getAppointmentID() {
        return appointmentID;
    }

    public void setAppointmentID(String appointmentID) {
        this.appointmentID = appointmentID;
    }
    
    
   
    @Override
    public String toString(){
        return appointmentID;
    }
}
