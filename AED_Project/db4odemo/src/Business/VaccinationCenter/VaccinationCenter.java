/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.VaccinationCenter;

/**
 *
 * @author Karan
 */
public class VaccinationCenter {
    private String centerName;
    private String centerAddress;
    private String centerZipCode;
    private String centerContact;
    private long centerBalanceDoses;
    private String stateGovName;
    
    public VaccinationCenter(String centerName, String centerAddress, String centerZipCode, String centerContact, long centerBalanceDoses, String stateGovName){
        this.centerName = centerName;
        this.centerAddress = centerAddress;
        this.centerZipCode = centerZipCode;
        this.centerContact = centerContact;
        this.centerBalanceDoses = centerBalanceDoses;
        this.stateGovName = stateGovName;
    }

    public String getStateGovName() {
        return stateGovName;
    }

    public void setStateGovName(String stateGovName) {
        this.stateGovName = stateGovName;
    }
    
    

    public String getCenterName() {
        return centerName;
    }

    public void setCenterName(String centerName) {
        this.centerName = centerName;
    }

    public String getCenterAddress() {
        return centerAddress;
    }

    public void setCenterAddress(String centerAddress) {
        this.centerAddress = centerAddress;
    }

    public String getCenterZipCode() {
        return centerZipCode;
    }

    public void setCenterZipCode(String centerZipCode) {
        this.centerZipCode = centerZipCode;
    }

    public String getCenterContact() {
        return centerContact;
    }

    public void setCenterContact(String centerContact) {
        this.centerContact = centerContact;
    }

    public long getCenterBalanceDoses() {
        return centerBalanceDoses;
    }

    public void setCenterBalanceDoses(long centerBalanceDoses) {
        this.centerBalanceDoses = centerBalanceDoses;
    }

    
    @Override
    public String toString(){
        return centerName;
    }
}

