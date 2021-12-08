/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.VaccinationSession;

import Business.SessionManagers.SessionManager;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Karan
 */
public class VaccinationSessionDirectory {
    
    private ArrayList<VaccinationSession> vaccinationSessionDirectory;
    
    public VaccinationSessionDirectory(){
        vaccinationSessionDirectory = new ArrayList();
    }

    public ArrayList<VaccinationSession> getVaccinationSessionDirectory() {
        return vaccinationSessionDirectory;
    }

    public void setVaccinationSessionDirectory(ArrayList<VaccinationSession> vaccinationSessionDirectory) {
        this.vaccinationSessionDirectory = vaccinationSessionDirectory;
    }
    
    public VaccinationSession getVaccinationSession(String name){
        for (VaccinationSession sm: vaccinationSessionDirectory){
            if(sm.getSessionName().equalsIgnoreCase(name)){
                return sm;
            }
        }
        return null;
    }
    
    
    public VaccinationSession addVaccinationSession(String sessionName, String sessionDate,float startTime,float endTime,String sessionManager,String aefiManager, String vaccinator, String vaccineName, double availableDoses, String centerName){
        VaccinationSession sm = new VaccinationSession(sessionName, sessionDate,startTime, endTime,sessionManager, aefiManager, vaccinator, vaccineName, availableDoses, centerName);
        vaccinationSessionDirectory.add(sm);
        return sm;
    }
    
    public void removeVaccinationCenter(VaccinationSession sm){
        vaccinationSessionDirectory.remove(sm);
    }
    
}
