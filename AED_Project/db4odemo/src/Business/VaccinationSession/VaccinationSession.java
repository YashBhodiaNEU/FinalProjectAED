/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.VaccinationSession;

import Business.AEFIManager.AEFIManager;
import Business.SessionManagers.SessionManager;
import Business.VaccinationCenter.VaccinationCenter;
import java.util.Date;

/**
 *
 * @author Karan
 */
public class VaccinationSession{
    private String sessionName;
    private String sessionDate;
    private float startTime;
    private float endTime;
    private String sessionManager;
    private String aefiManager;
    private String vaccinator;
    private String vaccineName;
    private double availableDoses;
    private String centerName;
    
    public VaccinationSession(String sessionName, String sessionDate,float startTime,float endTime,String sessionManager,String aefiManager, String vaccinator, String vaccineName, double availableDoses, String centerName){
        this.sessionName = sessionName;
        this.sessionDate = sessionDate;
        this.startTime = startTime;
        this.endTime = endTime;
        this.sessionManager = sessionManager;
        this.aefiManager = aefiManager;
        this.vaccinator = vaccinator;
        this.vaccineName = vaccineName;
        this.availableDoses = availableDoses;
        this.centerName = centerName;
    }
    
    public String getCenterName() {
        return centerName;
    }

    public void setCenterName(String centerName) {
        this.centerName = centerName;
    }
    
    public String getSessionName() {
        return sessionName;
    }

    public void setSessionName(String sessionName) {
        this.sessionName = sessionName;
    }

    public String getSessionDate() {
        return sessionDate;
    }

    public void setSessionDate(String sessionDate) {
        this.sessionDate = sessionDate;
    }

    public float getStartTime() {
        return startTime;
    }

    public void setStartTime(float startTime) {
        this.startTime = startTime;
    }

    public float getEndTime() {
        return endTime;
    }

    public void setEndTime(float endTime) {
        this.endTime = endTime;
    }

    public String getSessionManager() {
        return sessionManager;
    }

    public void setSessionManager(String sessionManager) {
        this.sessionManager = sessionManager;
    }

    public String getAefiManager() {
        return aefiManager;
    }

    public void setAefiManager(String aefiManager) {
        this.aefiManager = aefiManager;
    }

    public String getVaccinator() {
        return vaccinator;
    }

    public void setVaccinator(String vaccinator) {
        this.vaccinator = vaccinator;
    }

    public String getVaccineName() {
        return vaccineName;
    }

    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }

    public double getAvailableDoses() {
        return availableDoses;
    }

    public void setAvailableDoses(double availableDoses) {
        this.availableDoses = availableDoses;
    }
    
    
    @Override
    public String toString(){
        return sessionName;
    }
    
}
