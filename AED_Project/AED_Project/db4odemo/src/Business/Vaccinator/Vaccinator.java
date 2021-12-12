/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Vaccinator;

/**
 *
 * @author Karan
 */
public class Vaccinator {
    private String vaccinatorName;
    private String vaccinatorEmailID;
    private String centerName;
    
    public Vaccinator(String vaccinatorName, String vaccinatorEmailID, String centerName){
        this.vaccinatorName = vaccinatorName;
        this.vaccinatorEmailID = vaccinatorEmailID;
        this.centerName = centerName;
    }

    public String getVaccinatorName() {
        return vaccinatorName;
    }

    public void setVaccinatorName(String vaccinatorName) {
        this.vaccinatorName = vaccinatorName;
    }

    public String getVaccinatorEmailID() {
        return vaccinatorEmailID;
    }

    public void setVaccinatorEmailID(String vaccinatorEmailID) {
        this.vaccinatorEmailID = vaccinatorEmailID;
    }

    public String getCenterName() {
        return centerName;
    }

    public void setCenterName(String centerName) {
        this.centerName = centerName;
    }
    
    @Override
    public String toString(){
        return vaccinatorName;
    }
    
}
